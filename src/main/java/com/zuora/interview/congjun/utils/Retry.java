package com.zuora.interview.congjun.utils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Refer:https://blog.csdn.net/qq744746842/article/details/51428938
 * 
 * */

public class Retry implements IRetryAnalyzer{
	private int retryCount        = 0;
    private int maxRetryCount     = 2;   // retry a failed test 2 additional times

    public boolean retry(ITestResult result) {
        if (retryCount <maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
