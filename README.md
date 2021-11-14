## Android Java Splesh Screen Exmple

<img src="/exampleImg/spleshScreen.gif" width="300" height="700">

- **AndroidManifest.xml**

```xml
<activity
    android:name=".MainActivity"
    android:exported="false" />
<activity
    android:name=".SpleshActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />

        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```

- **SpleshActivity.java**

```java
 new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent intent = new Intent(SpleshActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
},2000);
```

- **activity_splesh.xml**

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".SpleshActivity">

    <ImageView
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:src="@drawable/logo"
        android:layout_centerInParent="true" />

</RelativeLayout>
```
