# Responsive Layout 1

Practical 1 – Creating Responsive Android User Interfaces.

This repository contains two separate Android Studio applications that recreate
the same responsive user interface using two different layout techniques:

| Folder                 | Layout technique                |
|------------------------|---------------------------------|
| `LinearLayoutApp`      | Part 1 – LinearLayout + `layout_weight` |
| `ConstraintLayoutApp`  | Part 2 – ConstraintLayout + weighted chains |

## UI target

Top to bottom:

- Dark app bar showing **Lab 1**
- White title bar showing **Responsive Layout 1**
- Four equal coloured blocks: **This** (red), **is** (blue), **my** (purple), **first** (yellow)
- Black text area showing **Android Application**
- Two purple rounded buttons: **Change** and **Cancel**

The interface is fully written by hand in XML (no drag-and-drop), uses no fixed
pixel (`px`) dimensions and reflows when the screen size or orientation changes.

## Requirements

- Android Studio (Iguana or newer recommended)
- JDK 17 or newer
- Android SDK Platform 34

## How to open

1. Open Android Studio.
2. `File > Open...` and select `LinearLayoutApp` (Part 1) or `ConstraintLayoutApp` (Part 2).
3. Let Gradle sync finish, then run the app on an emulator or device.
