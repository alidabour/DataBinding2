# DataBinding2
# Collecting examples about Android Databinding 


## Two Way binding 
TwoBindingActivity display two parallel fragments,
EditFragment(Yellow) and ViewingFragment(Green), both fragment use same viewModel where data entered in EditFragment are observed into ViewingFramgment.
Example contians : EditText, Visibility trigger,SeekBar and Spinner

<img src="/edit.png?raw=true" width="35%"></img>
<img src="/view.png?raw=true" width="35%"></img>
## Implicit Attribute Listeners

You can also reference attributes on other Views:
```
 <layout ...>
  <data>
    <import type="android.view.View"/>
  </data>
  <RelativeLayout ...>
    <CheckBox android:id="@+id/seeAds" .../>
    <ImageView android:visibility="@{seeAds.checked ? View.VISIBLE : View.GONE}" .../>
  </RelativeLayout>
</layout>
```
In the above, whenever the checked state of CheckBox changes, the ImageView’s visibility will change. No need to attach a listener on your own! This kind of expression only works with attributes that support 2-way data binding and those that have binding expressions.
[halfthought blog](https://halfthought.wordpress.com/2016/03/23/2-way-data-binding-on-android/)
, [code example](https://github.com/alidabour/DataBinding2/blob/7265b7b282401cc1542183c64ce310d803f74467/app/src/main/res/layout/fragment_edit.xml#L55)
