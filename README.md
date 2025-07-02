# 📺 TV App - Jetpack Compose Video Player

A sleek Android TV-style app built using **Jetpack Compose**, **Kotlin**, and **ExoPlayer** that fetches and displays popular videos using the **Pexels API**. Users can browse video thumbnails and tap to watch full-screen high-definition content.

---
## 🚀 Features
- 🔥 Fetches trending videos from Pexels API
- 🎬 Full-screen video playback using ExoPlayer
- ⚙️ Built with clean architecture: `ViewModel`, `Retrofit`, and `StateFlow`
- 🎨 Modern UI with Material 3 and Jetpack Compose
- 🔁 Error handling with retry support
- 📱 Optimized for both phones and TVs
---
## 🧱 Architecture
- **Jetpack Compose**: Declarative UI toolkit
- **MVVM**: ViewModel for UI logic and state management
- **Retrofit**: Networking layer to interact with Pexels API
- **ExoPlayer**: Video playback engine
- **StateFlow**: For reactive UI state updates

---
## 🗂️ Project Structure
com.example.tvapp  
├── data  
│ ├── api # Retrofit client and Pexels API interface  
│ └── model # Data models for parsing JSON  
├── ui  
│ └── screen # Compose UI screens  
├── viewmodel # VideoViewModel with StateFlow  
└── MainActivity.kt # App entry point and navigation


---

## 🔑 API Setup

This app uses the [Pexels Video API](https://www.pexels.com/api/documentation/#videos-search) which requires an API key.

---

### To use your own key:
1. Go to [Pexels](https://www.pexels.com/api/) and generate a free API key.
2. Open `VideoViewModel.kt`
3. Replace the `apiKey` variable with your key:

```kotlin
private val apiKey = "YOUR_API_KEY_HERE"