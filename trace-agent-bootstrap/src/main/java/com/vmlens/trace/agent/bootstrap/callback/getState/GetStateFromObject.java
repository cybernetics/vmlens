package com.vmlens.trace.agent.bootstrap.callback.getState;


import java.lang.reflect.Field;

import com.vmlens.trace.agent.bootstrap.callback.CallbackState;
import com.vmlens.trace.agent.bootstrap.callback.state.StateAccess;

import sun.misc.Unsafe;



public class GetStateFromObject implements GetState {

	
	 private static final Unsafe unsafe = Unsafe.getUnsafe();
	 private final long fieldOffset;
	 
	 
	 public  void resetState(Object in)
	 {
		 unsafe.putObjectVolatile(in, fieldOffset,  null);
	 }
	 
	 
	 
	 
	GetStateFromObject(long fieldOffset) {
		super();
		this.fieldOffset = fieldOffset;
	}



	
	public StateAccess getState(Object in)
	{
		
	
	   return new StateAccess(in,fieldOffset);
	
	}




	public static GetStateFromObject create(Class cl) throws NoSuchFieldException, SecurityException
	{
		
		try{
    		CallbackState.callbackStatePerThread.get().stackTraceBasedDoNotTrace++;
		
		Field field = cl.getDeclaredField("_pAnarsoft_");
		return new GetStateFromObject(unsafe.objectFieldOffset( field));
		}
		finally
		{
			CallbackState.callbackStatePerThread.get().stackTraceBasedDoNotTrace--;
		}
		
		
	}
	
	
	
	
	
	
}
