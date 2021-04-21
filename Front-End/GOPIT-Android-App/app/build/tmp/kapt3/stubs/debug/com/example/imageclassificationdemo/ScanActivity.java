package com.example.imageclassificationdemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J+\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020)H\u0016\u00a2\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\n \u0007*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/example/imageclassificationdemo/ScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "camera", "Landroidx/camera/core/Camera;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis;", "preview", "Landroidx/camera/core/Preview;", "recogViewModel", "Lorg/tensorflow/lite/examples/classification/viewmodel/RecognitionListViewModel;", "getRecogViewModel", "()Lorg/tensorflow/lite/examples/classification/viewmodel/RecognitionListViewModel;", "recogViewModel$delegate", "Lkotlin/Lazy;", "resultRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getResultRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "resultRecyclerView$delegate", "viewFinder", "Landroidx/camera/view/PreviewView;", "getViewFinder", "()Landroidx/camera/view/PreviewView;", "viewFinder$delegate", "allPermissionsGranted", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "startCamera", "ImageAnalyzer", "app_debug"})
public final class ScanActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.camera.core.Preview preview;
    private androidx.camera.core.ImageAnalysis imageAnalyzer;
    private androidx.camera.core.Camera camera;
    private final java.util.concurrent.ExecutorService cameraExecutor = null;
    private final kotlin.Lazy resultRecyclerView$delegate = null;
    private final kotlin.Lazy viewFinder$delegate = null;
    private final kotlin.Lazy recogViewModel$delegate = null;
    
    private final androidx.recyclerview.widget.RecyclerView getResultRecyclerView() {
        return null;
    }
    
    private final androidx.camera.view.PreviewView getViewFinder() {
        return null;
    }
    
    private final org.tensorflow.lite.examples.classification.viewmodel.RecognitionListViewModel getRecogViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void startCamera() {
    }
    
    public ScanActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012+\u0010\u0004\u001a\'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u0004\u001a\'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/imageclassificationdemo/ScanActivity$ImageAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "ctx", "Landroid/content/Context;", "listener", "Lkotlin/Function1;", "", "Lorg/tensorflow/lite/examples/classification/viewmodel/Recognition;", "Lkotlin/ParameterName;", "name", "recognition", "", "Lcom/example/imageclassificationdemo/RecognitionListener;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "bitmapBuffer", "Landroid/graphics/Bitmap;", "gcModel", "Lcom/example/imageclassificationdemo/ml/GCModel;", "rotationMatrix", "Landroid/graphics/Matrix;", "yuvToRgbConverter", "Lorg/tensorflow/lite/examples/classification/util/YuvToRgbConverter;", "analyze", "imageProxy", "Landroidx/camera/core/ImageProxy;", "toBitmap", "app_debug"})
    static final class ImageAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
        private final com.example.imageclassificationdemo.ml.GCModel gcModel = null;
        
        /**
         * Convert Image Proxy to Bitmap
         */
        private final org.tensorflow.lite.examples.classification.util.YuvToRgbConverter yuvToRgbConverter = null;
        private android.graphics.Bitmap bitmapBuffer;
        private android.graphics.Matrix rotationMatrix;
        private final kotlin.jvm.functions.Function1<java.util.List<org.tensorflow.lite.examples.classification.viewmodel.Recognition>, kotlin.Unit> listener = null;
        
        @java.lang.Override()
        public void analyze(@org.jetbrains.annotations.NotNull()
        androidx.camera.core.ImageProxy imageProxy) {
        }
        
        @android.annotation.SuppressLint(value = {"UnsafeExperimentalUsageError"})
        private final android.graphics.Bitmap toBitmap(androidx.camera.core.ImageProxy imageProxy) {
            return null;
        }
        
        public ImageAnalyzer(@org.jetbrains.annotations.NotNull()
        android.content.Context ctx, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.List<org.tensorflow.lite.examples.classification.viewmodel.Recognition>, kotlin.Unit> listener) {
            super();
        }
    }
}