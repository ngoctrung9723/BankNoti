// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false // Thay version cho phù hợp với phiên bản Android Studio của bạn
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false // Thay version cho phù hợp
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false // Nếu bạn dùng Room, hãy bỏ comment dòng này và điều chỉnh version cho phù hợp.
    id("androidx.navigation.safeargs.kotlin") version "2.7.2" apply false // Nếu dùng Safe Args
}