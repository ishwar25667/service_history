package com.toyo.operation.history.boot;

import java.util.Map;

/**
 * 
 * @author 212421693 -
 */
public class EventError
{
    /**
     * status
     */
    public Integer status;
    /**
     * 
     */
    /**
     * error
     */
    public String  error;
    /**
     * 
     */
    /**
     * message
     */
    public String  message;
    /**
     * timeStamp
     */
    public String  timeStamp;

    /**
     * @param status
     *            -
     * @param errorAttributes
     *            -
     */
    public EventError(int status, Map<String, Object> errorAttributes)
    {
        this.status = status;
        this.error = (String) errorAttributes.get("error"); //$NON-NLS-1$
        this.message = (String) errorAttributes.get("message"); //$NON-NLS-1$
        this.timeStamp = errorAttributes.get("timestamp").toString(); //$NON-NLS-1$

    }
}
