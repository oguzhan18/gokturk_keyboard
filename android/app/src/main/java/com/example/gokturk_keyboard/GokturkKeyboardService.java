package com.example.gokturk_keyboard;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class GokturkKeyboardService extends InputMethodService {
    private View mainKeyboardView;
    private View numbersKeyboardView;
    private View emojiKeyboardView;

    @Override
    public View onCreateInputView() {
        mainKeyboardView = getLayoutInflater().inflate(R.layout.keyboard, null);
        numbersKeyboardView = getLayoutInflater().inflate(R.layout.keyboard_numbers, null);
        emojiKeyboardView = getLayoutInflater().inflate(R.layout.keyboard_emojis, null);

        setupMainKeyboard(mainKeyboardView);
        setupNumbersKeyboard(numbersKeyboardView);
        setupEmojiKeyboard(emojiKeyboardView);

        return mainKeyboardView;
    }

    private void setupMainKeyboard(View keyboardView) {

        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_1, "𐰀");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_2, "𐰁");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_3, "𐰂");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_4, "𐰃");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_5, "𐰄");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_6, "𐰅");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_7, "𐰆");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_8, "𐰇");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_9, "𐰈");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_10, "𐰉");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_11, "𐰊");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_12, "𐰋");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_13, "𐰌");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_14, "𐰍");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_15, "𐰎");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_16, "𐰏");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_17, "𐰐");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_18, "𐰑");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_19, "𐰒");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_20, "𐰓");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_21, "𐰔");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_22, "𐰕");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_23, "𐰖");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_24, "𐰗");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_25, "𐰘");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_26, "𐰙");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_27, "𐰚");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_28, "𐰛");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_29, "𐰜");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_30, "𐰝");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_31, "𐰞");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_32, "𐰟");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_33, "𐰠");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_34, "𐰡");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_35, "𐰢");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_36, "𐰣");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_37, "𐰤");
        addLetterButtonClickListener(keyboardView, R.id.button_gokturk_letter_38, "𐰥");

        Button spaceButton = keyboardView.findViewById(R.id.button_space);
        if (spaceButton != null) {
            spaceButton.setOnClickListener(v -> getCurrentInputConnection().commitText(" ", 1));
        }

        Button deleteButton = keyboardView.findViewById(R.id.button_delete);
        if (deleteButton != null) {
            deleteButton.setOnClickListener(v -> getCurrentInputConnection().deleteSurroundingText(1, 0));
        }

        Button numbersButton = keyboardView.findViewById(R.id.button_numbers);
        if (numbersButton != null) {
            numbersButton.setOnClickListener(v -> setInputView(numbersKeyboardView));
        }

        Button emojiButton = keyboardView.findViewById(R.id.button_emoji);
        if (emojiButton != null) {
            emojiButton.setOnClickListener(v -> setInputView(emojiKeyboardView));
        }
    }

    private void setupNumbersKeyboard(View keyboardView) {
        // Sayı ve özel karakter butonlarını ekleyin

        Button backButton = keyboardView.findViewById(R.id.button_back);
        if (backButton != null) {
            backButton.setOnClickListener(v -> setInputView(mainKeyboardView));
        }
    }

    private void setupEmojiKeyboard(View keyboardView) {
        // Emoji butonlarını ekleyin

        Button backButton = keyboardView.findViewById(R.id.button_back);
        if (backButton != null) {
            backButton.setOnClickListener(v -> setInputView(mainKeyboardView));
        }
    }

    private void addLetterButtonClickListener(View keyboardView, int buttonId, String letter, String hint) {
        Button button = keyboardView.findViewById(buttonId);
        if (button != null) {
            button.setOnClickListener(v -> getCurrentInputConnection().commitText(letter, 1));
            button.setOnLongClickListener(v -> {
                Toast.makeText(this, hint, Toast.LENGTH_SHORT).show();
                return true;
            });
        }
    }

    @Override
    public void onStartInput(EditorInfo attribute, boolean restarting) {
        super.onStartInput(attribute, restarting);
    }
}