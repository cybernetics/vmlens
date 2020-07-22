package com.vmlens.api.callback

import java.io._;
import org.apache.commons.io._;
import  com.anarsoft.race.detection.model.result.ModelFacade
import com.anarsoft.config.MavenMojo

object TestUtil {
  
    def log4StabilityTest(source: String, mavenMojo: MavenMojo) {

  //  if (System.getProperty("stabilityTest") != null && System.getProperty("stabilityTest").equals("true")) {
      FileUtils.copyDirectoryToDirectory(mavenMojo.getReportDir(), new File("/tmp/stabilityTest/report" + "/"));
      FileUtils.copyDirectoryToDirectory(new File(source), new File("/tmp/stabilityTest/event" +  "/"));
  //  }
  }
  
    
    
    def printAgentLog(modelFacade : ModelFacade)
    {
      for( m <- modelFacade.agentLog )
      {
        println(m);
      }
    }
    
    
    def writeAgentRun( mavenMojo: MavenMojo)
    {
      new File( "/tmp/agentRun" ).createNewFile();
    }
    
    
    def deleteAgentRun()
    {
          new File( "/tmp/agentRun" ).delete();
    }
    
  
    def agentWasRun() =    new File("/tmp/agentRun" ).exists();
      
    
    
}