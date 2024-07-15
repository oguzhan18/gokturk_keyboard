// ignore_for_file: avoid_print

import 'package:flutter/services.dart';

class GokturkKeyboard {
  static const platform =
      MethodChannel('com.example.gokturk_keyboard/keyboard');

  Future<void> sendKeyPress(String key) async {
    try {
      await platform.invokeMethod('sendKeyPress', {"key": key});
    } on PlatformException catch (e) {
      print("Failed to send key press: '${e.message}'.");
    }
  }
}
