# 总结--Android 状态栏与导航栏设置

## DecorView.setSystemUiVisibility()
- **SYSTEM_UI_FLAG_VISIBLE** : 显示系统UI (SYSTEM_UI)
- **SYSTEM_UI_FLAG_LOW_PROFILE** : 低调模式,隐藏状态栏上不重要的图标
- **SYSTEM_UI_FLAG_HIDE_NAVIGATION** : 隐藏导航栏
- **SYSTEM_UI_FLAG_FULLSCREEN** : 隐藏状态栏
- **SYSTEM_UI_FLAG_LAYOUT_STABLE** : 布局不随SYSTEM_UI改变位置
- **SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION** : 布局延伸到导航栏
- **SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN** : 布局延伸到状态栏
- **SYSTEM_UI_FLAG_IMMERSIVE** : 沉浸式,触摸永久显示SYSTEM_UI
- **SYSTEM_UI_FLAG_IMMERSIVE_STICKY** : 沉浸式,触摸临时显示SYSTEM_UI
- **SYSTEM_UI_FLAG_LIGHT_STATUS_BAR** : 轻主题状态栏
- **SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR** : 轻主题导航栏

## fitSystemWindows属性
默认是false,设为true可以消费掉SYSTEM_UI的padding

## 颜色设置
### 1. 5.0以上
- **状态栏** : window.statusBarColor
- **导航栏** : window.navigationBarColor
### 2. 4.4以上
- **状态栏半透明** : window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
- **导航栏半透明** : window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)