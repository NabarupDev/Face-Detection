# Advanced Face Detection and Recognition System

![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)
![Platform](https://img.shields.io/badge/Platform-Android-green.svg)
![API Level](https://img.shields.io/badge/API-21%2B-brightgreen.svg)

A sophisticated Android application that provides real-time face detection, anti-spoofing liveness checks, and accurate face recognition capabilities using advanced computer vision algorithms.

## 🌟 Features

- **Real-time Face Detection**: Identifies human faces in both images and live camera feed
- **Anti-spoofing Technology**: Performs liveness detection to prevent photo/video attacks
- **Face Recognition**: Accurate matching against enrolled face templates
- **Multiple Liveness Levels**: Configurable security thresholds for different use cases
- **Pose Estimation**: Detects face orientation (yaw, pitch, roll)
- **Camera Options**: Support for both front and rear cameras
- **User Management**: Enroll, identify and delete face templates with persistent storage
- **Configurable Parameters**: Adjustable thresholds for liveness and recognition confidence

## 📋 Requirements

- Android Studio Arctic Fox (2021.3.1) or higher
- Android API level 21+ (Android 5.0 Lollipop or higher)
- Camera hardware with autofocus capability
- Minimum 2GB RAM on device for optimal performance

## 🛠️ Architecture

The application follows the MVVM (Model-View-ViewModel) architecture with these main components:

- **UI Layer**: Activities for enrollment, identification, and settings management
- **Camera**: Uses CameraX API for modern camera operation
- **Face Processing**: Leverages native SDK for face detection and template extraction
- **Database**: SQLite for storing face templates and metadata
- **Settings**: SharedPreferences-based configuration management

## 🚀 Installation

1. Clone the repository:
```
git clone https://github.com/NabarupDev/Face-Detection.git
```

2. Open the project in Android Studio

3. Set up the license key in MainActivity.kt:
```kotlin
FaceSDK.setActivation("YOUR_LICENSE_KEY")
```

4. Sync Gradle and run the application on a physical device (emulators may lack proper camera support)

## 📱 Usage

### Enrolling Faces
1. Launch the application and tap "Enroll"
2. Select or capture a photo containing a face
3. The system will extract facial features and store them in the database

### Identifying Faces
1. Tap "Identify" to launch the camera
2. Position a face in the frame
3. If the person is enrolled and passes the liveness check, the application will display their identity and match confidence

### Configuration
Tap "Settings" to access configurable parameters:
- Camera lens (front/back)
- Liveness detection threshold
- Identification confidence threshold
- Liveness security level

## ⚙️ Technical Details

### Face Detection Pipeline
1. Frame acquisition from camera or gallery
2. YUV to bitmap conversion
3. Face detection with bounding box extraction
4. Liveness analysis
5. Template extraction for recognized faces
6. Template comparison with database

### Performance Considerations
- All core detection and recognition operations run on the device
- Optimized for real-time processing on mid-range devices
- Camera resolution set to optimal values for face detection (720x1280)

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Implement your changes and add tests where possible
4. Commit your changes (`git commit -m 'Add amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🔒 Security Considerations

- The application stores biometric templates locally, not raw facial images
- Consider implementing additional encryption for the SQLite database in production environments
- Review and comply with local regulations regarding biometric data collection and storage

## 📞 Contact

For commercial licensing and support, please contact:
- Email: nabaruproy.dev@gmail.com
- GitHub: [NabarupDev](https://github.com/NabarupDev)
