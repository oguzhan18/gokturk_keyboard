# Göktürk Keyboard
A modern and intuitive keyboard for typing in the ancient Göktürk script on Android devices. This project aims to provide a seamless typing experience with support for both light and dark modes.

## Features
* Modern UI: Clean and user-friendly design with rounded buttons and adaptive themes.
* Light and Dark Modes: Automatically switches between light and dark themes based on system settings.
* Full Göktürk Alphabet: Includes all characters from the Göktürk script.
* Customizable: Easily adjust the appearance and behavior of the keyboard.
* Emoji and Numeric Keyboards: Quickly switch between Göktürk, numeric, and emoji keyboards.

## Installation
### Prerequisites
* Flutter SDK
### Steps
1- Clone the repository:
```bash
git clone https://github.com/oguzhan18/gokturk_keyboard.git
cd gokturk_keyboard
```
2- Install dependencies:
```bash
flutter pub get
```
3- Run the app:

## Usage
1. Enable the Keyboard:
 * Go to Settings > `System` > Languages & input > Virtual keyboard > Manage keyboards.
 * Enable the `Göktürk Keyboard`.
2. Select the Keyboard:
   * Open any app that allows text input.
   * Tap on the text field to bring up the keyboard.
   * Select `Göktürk Keyboard` from the keyboard selection menu.
## Customization
### Colors and Themes
* Light mode colors are defined in res/values/colors.xml.
* Dark mode colors are defined in res/values-night/colors.xml.
### Button Styles
* Button styles can be customized in res/values/styles.xml.
### Keyboard Layouts
* The main keyboard layout is defined in res/layout/keyboard.xml.
* Numeric and emoji keyboard layouts are defined in res/layout/keyboard_numbers.xml and res/layout/keyboard_emojis.xml.




