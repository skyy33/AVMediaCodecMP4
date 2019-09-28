package com.example.apadmin.cameraphoto;

/**
 * Created by zhongjihao on 19-9-25.
 */
public class YuvEngineWrap {
    private long cPtr;
    private static YuvEngineWrap mInstance;
    private static Object lockobj = new Object();

    private YuvEngineWrap() {
        cPtr = 0;
    }

    public static YuvEngineWrap newInstance() {
        synchronized (lockobj) {
            if (mInstance == null) {
                mInstance = new YuvEngineWrap();
            }
        }
        return mInstance;
    }

    //启动yuv引擎
    public void startYuvEngine() {
        cPtr = YuvOperateJni.startYuvEngine();
    }

    /**
     *YV12 -> I420
     */
    public void Yv12ToI420(byte[] pYv12, byte[] pI420, int width, int height) {
        if (cPtr != 0) {
            YuvOperateJni.Yv12ToI420(cPtr, pYv12, pI420, width, height);
        }
    }

    /**
     *I420 -> YV12
     */
    public void I420ToYv12(byte[] pI420, byte[] pYv12, int width, int height) {
        if (cPtr != 0) {
            YuvOperateJni.I420ToYv12(cPtr,pI420, pYv12,width,height);
        }
    }

    /**
     * NV21 -> I420
     */
    public void Nv21ToI420(byte[] pNv21,byte[] pI420,int width,int height) {
        if (cPtr != 0) {
            YuvOperateJni.Nv21ToI420(cPtr, pNv21,pI420, width,height);
        }
    }

    /**
     * I420 -> NV21
     */
    public void I420ToNv21(byte[] pI420,byte[] pNv21,int width,int height) {
        if (cPtr != 0) {
            YuvOperateJni.I420ToNv21(cPtr, pI420, pNv21, width, height);
        }
    }

    /**
     * NV21 -> YV12
     */
    public void Nv21ToYv12(byte[] pNv21,byte[] pYv12,int width,int height) {
        if (cPtr != 0) {
            YuvOperateJni.Nv21ToYV12(cPtr, pNv21,pYv12, width,height);
        }
    }

    /**
     * YV12 -> NV21
     */
    public void Yv12ToNv21(byte[] pYv12,byte[] pNv21,int width,int height) {
        if (cPtr != 0) {
            YuvOperateJni.YV12ToNv21(cPtr, pYv12, pNv21, width, height);
        }
    }

    /**
     * NV21 -> NV12
     */
    public void Nv21ToNv12(byte[] pNv21,byte[] pNv12,int width,int height){
        if (cPtr != 0) {
            YuvOperateJni.Nv21ToNv12(cPtr,pNv21,pNv12, width, height);
        }
    }

    /**
     *NV12 -> NV21
     */
    public void Nv12ToNv21(byte[] pNv12,byte[] pNv21,int width,int height){
        if (cPtr != 0) {
            YuvOperateJni.Nv12ToNv21(cPtr,pNv12,pNv21, width, height);
        }
    }

    /**
     * Nv21顺时针旋转90度
     * pNv21     原nv21数据
     * srcWidth  原nv21对应的宽
     * srcHeight 原nv21对应的高
     * outData   旋转后的nv21数据
     * outWidth  旋转后对应的宽
     * outHeight 旋转后对应的高
     */
    public void Nv21ClockWiseRotate90(byte[] pNv21,int srcWidth,int srcHeight,byte[] outData,int[] outWidth,int[] outHeight){
        if (cPtr != 0) {
            YuvOperateJni.Nv21ClockWiseRotate90(cPtr, pNv21, srcWidth, srcHeight,outData,outWidth,outHeight);
        }
    }

    /**
     * Nv12顺时针旋转90度
     * pNv12     原nv12数据
     * srcWidth  原nv12对应的宽
     * srcHeight 原nv12对应的高
     * outData   旋转后的nv12数据
     * outWidth  旋转后对应的宽
     * outHeight 旋转后对应的高
     */
    public void Nv12ClockWiseRotate90(byte[] pNv12,int srcWidth,int srcHeight,byte[] outData,int[] outWidth,int[] outHeight){
        if (cPtr != 0) {
            YuvOperateJni.Nv21ClockWiseRotate90(cPtr, pNv12, srcWidth, srcHeight,outData,outWidth,outHeight);
        }
    }

    /**
     * Nv21顺时针旋转180度
     * pNv21     原nv21数据
     * srcWidth  原nv21对应的宽
     * srcHeight 原nv21对应的高
     * outData   旋转后的nv21数据
     * outWidth  旋转后对应的宽
     * outHeight 旋转后对应的高
     */
    public void Nv21ClockWiseRotate180(byte[] pNv21,int srcWidth,int srcHeight,byte[] outData,int[] outWidth,int[] outHeight){
        if (cPtr != 0) {
            YuvOperateJni.Nv21ClockWiseRotate180(cPtr, pNv21, srcWidth, srcHeight,outData,outWidth,outHeight);
        }
    }

    /**
     * Nv21顺时针旋转270度
     * pNv21     原nv21数据
     * srcWidth  原nv21对应的宽
     * srcHeight 原nv21对应的高
     * outData   旋转后的nv21数据
     * outWidth  旋转后对应的宽
     * outHeight 旋转后对应的高
     */
    public void Nv21ClockWiseRotate270(byte[] pNv21,int srcWidth,int srcHeight,byte[] outData,int[] outWidth,int[] outHeight){
        if (cPtr != 0) {
            YuvOperateJni.Nv21ClockWiseRotate270(cPtr, pNv21, srcWidth, srcHeight,outData,outWidth,outHeight);
        }
    }

    /**
     * I420顺时针旋转90度
     * pI420     原I420数据
     * srcWidth  原I420对应的宽
     * srcHeight 原I420对应的高
     * outData   旋转后的I420数据
     * outWidth  旋转后对应的宽
     * outHeight 旋转后对应的高
     */
    public void I420ClockWiseRotate90(byte[] pI420, int srcWidth,int srcHeight,byte[] outData, int[] outWidth,int[] outHeight){
        if (cPtr != 0) {
            YuvOperateJni.I420ClockWiseRotate90(cPtr, pI420, srcWidth, srcHeight,outData,outWidth,outHeight);
        }
    }

    /**
     * YV12顺时针旋转90度
     * pYv12     原Yv12数据
     * srcWidth  原Yv12对应的宽
     * srcHeight 原Yv12对应的高
     * outData   旋转后的Yv12数据
     * outWidth  旋转后对应的宽
     * outHeight 旋转后对应的高
     */
    public void Yv12ClockWiseRotate90(byte[] pYv12, int srcWidth,int srcHeight,byte[] outData, int[] outWidth,int[] outHeight){
        if (cPtr != 0) {
            YuvOperateJni.Yv12ClockWiseRotate90(cPtr, pYv12, srcWidth, srcHeight,outData,outWidth,outHeight);
        }
    }

    //停止yuv引擎
    public void stopYuvEngine() {
        if (cPtr != 0) {
            YuvOperateJni.stopYuvEngine(cPtr);
        }
        mInstance = null;
    }


}