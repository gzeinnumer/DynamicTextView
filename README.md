# DynamicTextView

<pre>
<img src="preview/example1.jpeg" width="300">
</pre>

```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sample1();
    }

    private void sample1() {
        ArrayList<DynamicTextView.TextViewItem> textViewItems = new ArrayList<>();

        textViewItems.add(new DynamicTextView.TextViewItem("Title 1", "Conten 1"));
        textViewItems.add(new DynamicTextView.TextViewItem("Title 2", "Conten 2"));
        textViewItems.add(new DynamicTextView.TextViewItem("Title 3", "Conten 3"));
        textViewItems.add(new DynamicTextView.TextViewItem("Title 4", "Conten 4"));
        textViewItems.add(new DynamicTextView.TextViewItem("Title 5", "Conten 5"));

        LinearLayout parent = findViewById(R.id.parent);

        new DynamicTextView(getApplicationContext(), parent, R.layout.item_dynamic_textview)
                .setList(textViewItems)
                .build();
    }
}
```

- [DynamicTextView.java](app/src/main/java/com/gzeinnumer/dynamictextview/DynamicTextView.java)
- [item_dynamic_textview.xml](app/src/main/res/layout/item_dynamic_textview.xml)

If you want to custome text style, make sure you have this id `tv_title` and `tv_content`.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    ... >

    <TextView
        android:id="@+id/tv_title"
        ...
        />

    <TextView
        android:id="@+id/tv_content"
        ...
        />
</LinearLayout>
```

---

```
Copyright 2022 M. Fadli Zein
```