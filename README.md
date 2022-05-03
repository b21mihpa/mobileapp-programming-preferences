# Report

This assignment introduces the concept and practice of [Shared Preferences](https://developer.android.com/training/data-storage/shared-preferences); a file storage system built into Android where small collections of data can be stored as key/value pairs. Such data can later be accessed by the application through the same API - even after the application has stopped execution. Since the data is written to a file, it is possible to access that data, so long as the data in the file has not been overwritten or the file itself been removed. Note that this is not intended for permanent storage, as there is no guarantee that the file will remain. Instead, it can be thought of as a way to keep track of state between various activities throughout the lifetime of the application.

## Reference a file by name

```java
final SharedPreferences sharedPref = getSharedPreferences("store", MODE_PRIVATE);
final SharedPreferences.Editor editor = sharedPref.edit();
```

The previous code illustrates how it is possible create a file handle to _store_ together with an editor - which is necessary when data is written to the file.

## Write data to the file

```java
editor.putBoolean("use_default_theme", false);
editor.apply();
```

The editor has several methods for other data types, such as `String` and `int`. Note, however, that the data is not written to the file until the `apply()`method has been issued.

## Read data from the file

```java
sharedPref.getBoolean("use_default_theme", true);
```

Note how the data is accessed by reference to the same key that was used when the data was first written to the file. The final argument is the value to be used whenever data cannot be retrieved.

<p align="center">
  <img src="demo.gif" width="400px"/>
</p>
