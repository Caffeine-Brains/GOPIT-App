package com.example.imageclassificationdemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/imageclassificationdemo/RecognitionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/tensorflow/lite/examples/classification/viewmodel/Recognition;", "Lcom/example/imageclassificationdemo/RecognitionViewHolder;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RecognitionDiffUtil", "app_debug"})
public final class RecognitionAdapter extends androidx.recyclerview.widget.ListAdapter<org.tensorflow.lite.examples.classification.viewmodel.Recognition, com.example.imageclassificationdemo.RecognitionViewHolder> {
    private final android.content.Context ctx = null;
    
    /**
     * Inflating the ViewHolder with recognition_item layout and data binding
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.imageclassificationdemo.RecognitionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.imageclassificationdemo.RecognitionViewHolder holder, int position) {
    }
    
    public RecognitionAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/imageclassificationdemo/RecognitionAdapter$RecognitionDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/tensorflow/lite/examples/classification/viewmodel/Recognition;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class RecognitionDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.tensorflow.lite.examples.classification.viewmodel.Recognition> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.tensorflow.lite.examples.classification.viewmodel.Recognition oldItem, @org.jetbrains.annotations.NotNull()
        org.tensorflow.lite.examples.classification.viewmodel.Recognition newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.tensorflow.lite.examples.classification.viewmodel.Recognition oldItem, @org.jetbrains.annotations.NotNull()
        org.tensorflow.lite.examples.classification.viewmodel.Recognition newItem) {
            return false;
        }
        
        public RecognitionDiffUtil() {
            super();
        }
    }
}