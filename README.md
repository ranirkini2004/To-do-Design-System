# 📝 Todo Design System – Jetpack Compose

A redesigned To-Do App Home Screen built using **Jetpack Compose** with a structured Design System.

This project demonstrates layout critique, spacing consistency, accessibility improvements, and reusable UI tokens.

---

## 📱 Project Overview

The original to-do home screen had:

- Clear layout structure
- Good readability
- Intuitive navigation

However, improvements were needed:

- Inconsistent spacing
- Low contrast subtasks
- Small touch targets
- Slightly heavy icon usage
- Limited accessibility labeling

This project refactors the UI using a proper Design System.

---

## 🎨 Design System

### 🔹 Spacing Scale

| Token  | Value |
|--------|--------|
| Tiny   | 4dp    |
| Default| 8dp    |
| Medium | 16dp   |
| Large  | 24dp   |

Usage:
```kotlin
Modifier.padding(LocalSpacing.current.medium)
```

---

### 🔹 Typography

| Style  | Size | Weight |
|---------|------|--------|
| Title   | 24sp | Bold   |
| Body    | 16sp | Normal |
| Label   | 14sp | Medium |

Using:
```kotlin
MaterialTheme.typography
```

---

### 🔹 Colors

| Token       | Value     |
|-------------|-----------|
| Primary     | #6750A4   |
| On Primary  | White     |
| Surface     | #F8F9FA   |
| Error       | #B3261E   |

---

## 🛠 Improvements Implemented

✅ Spacing aligned to 8dp grid  
✅ Minimum touch targets increased to 48dp  
✅ Improved contrast for subtasks  
✅ Reduced visual weight of icons  
✅ Added accessibility labels  
✅ Structured components using reusable tokens  

---

## 🧱 Components

### Button
- Padding: 16dp
- Corner Radius: 28dp

### Card
```kotlin
Surface(elevation = 4.dp)
```

---

## 📂 Project Structure

```
app
 └── src
     └── main
         └── java
             └── ui
                 ├── screens
                 │    └── TodoHomeScreen.kt
                 ├── components
                 ├── theme
                 │    ├── Color.kt
                 │    ├── Type.kt
                 │    ├── Spacing.kt
                 │    └── Theme.kt
```

---

## 🚀 Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Android Studio Ladybug

---


## 👩‍💻 Author

Rani Kini  
Android Developer (Jetpack Compose)

---

## 📌 Learning Outcomes

- Applied Design System principles
- Improved UI consistency
- Practiced Compose component structuring
- Implemented accessibility improvements
- Managed project using Git & GitHub

---

## ⭐ Future Improvements

- Add dark theme support
- Add animations
- Integrate navigation
- Connect to Room database
