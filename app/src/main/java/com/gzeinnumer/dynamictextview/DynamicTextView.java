package com.gzeinnumer.dynamictextview;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DynamicTextView {

    private final Context context;
    private final LinearLayout linearLayout;
    private ArrayList<TextViewItem> listString = new ArrayList<>();
    private int layout = R.layout.item_dynamic_textview;

    public DynamicTextView(Context context, LinearLayout linearLayout) {
        this.context = context;
        this.linearLayout = linearLayout;
    }

    public DynamicTextView(Context context, LinearLayout linearLayout, int layout) {
        this.context = context;
        this.linearLayout = linearLayout;
        this.layout = layout;
    }

    public DynamicTextView setList(ArrayList<TextViewItem> listString) {
        this.listString = listString;
        return this;
    }

    public void build() {
        for (int i = 0; i < listString.size(); i++) {
            TextViewItem d = listString.get(i);

            LinearLayout parent = (LinearLayout) View.inflate(context, layout, null);

            if (d.getTitle()!=null && d.getTitle().length()>0){
                try {
                    TextView tvTitle = parent.findViewById(R.id.tv_title);
                    tvTitle.setText(d.getTitle());
                } catch (Exception ignored){ }
            }

            if (d.getContent()!=null && d.getContent().length()>0){
                try {
                    TextView tvContent = parent.findViewById(R.id.tv_content);
                    tvContent.setText(d.getContent());
                } catch (Exception ignored){ }
            }

            linearLayout.addView(parent);
        }
    }

    public static class TextViewItem {
        private String title;
        private String content;

        public TextViewItem(String content) {
            this.content = content;
        }

        public TextViewItem(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
