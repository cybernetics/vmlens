package com.anarsoft.race.detection.process.partialOrder

import  com.anarsoft.race.detection.model.result._;
import com.anarsoft.race.detection.process.gen._
import com.anarsoft.race.detection.process.detectRaceConditions._

class RaceConditionFoundException(val read : EventWrapperDetectRaceConditions , val write : EventWrapperDetectRaceConditions) extends Exception{
 
  
   def take()
   {
     read.raceTaken = true;
     write.raceTaken = true;
   }
  
  
  override def toString() = read + " \n" + write;
  
 
  def getName(fieldAndArrayFacade : FieldAndArrayPerMethodFacade,stackTraceGraph : StackTraceGraph) = fieldAndArrayFacade.getQualifiedFieldName(read.getLocationInClass(),stackTraceGraph)
  
  
  def getFirstMethodName(stackTraceGraph : StackTraceGraph) = stackTraceGraph.getMethodModelForStackTraceNodeOrdinal(new StackTraceOrdinal(read.stackTraceOrdinal)).getFullNameWithoutBracket();
  def getSecondMethodName(stackTraceGraph : StackTraceGraph) = stackTraceGraph.getMethodModelForStackTraceNodeOrdinal(new StackTraceOrdinal(write.stackTraceOrdinal)).getFullNameWithoutBracket();
  
}