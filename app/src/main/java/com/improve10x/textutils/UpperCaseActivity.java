package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UpperCaseActivity extends AppCompatActivity {
    EditText textTxt;
    TextView upperTxt;
    Button submitBtn;
    TextView lowerCaseTxt;
    TextView lengthTxt;
    TextView trimTxt;
    TextView emptyTxt;
    TextView containsTxt;
    EditText charTxt;
    EditText letterTxt;
    TextView startWithTxt;
    EditText letterWithTxt;
    TextView endWithTxt;
    EditText letterIndexTxt;
    TextView indexTxt;
    EditText letterReplaceTxt;
    TextView replaceTxt;
    EditText letterLastTxt;
    TextView lastIndexTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_case);
        initViews();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        submitBtn.setOnClickListener(view -> {
            convertToUppercase();
            convertToLowerCASE();
            getLength();
            trimText();
            emptyText();
            containsText();
            startWith();
            onEndWith();
            indexOf();
            displayReplace();
            lastIndex();
        });
    }

    private void lastIndex() {
        String letterLastText = letterLastTxt.getText().toString();
       int indexText = enteredText().lastIndexOf(letterLastText);
       lastIndexTxt.setText(indexText + "");
    }

    private void displayReplace() {
        String letterReplaceText = letterReplaceTxt.getText().toString();
        String replaceText = enteredText().replace(enteredText(),letterReplaceText);
        replaceTxt.setText(replaceText);
    }

    private void indexOf() {
        String letterIndexText = letterIndexTxt.getText().toString();
        int indexText = enteredText().indexOf(letterIndexText);
        indexTxt.setText(indexText + "");
    }

    private void onEndWith() {
        String letterWithText = letterWithTxt.getText().toString();
        boolean endWithText = enteredText().endsWith(letterWithText);
        endWithTxt.setText(endWithText + "");
    }

    private void startWith() {
        String letterText = letterTxt.getText().toString();
        String startText = String.valueOf(enteredText().startsWith(letterText));
        startWithTxt.setText(startText);
    }

    private void containsText() {
        String charText = charTxt.getText().toString();
        String contains = String.valueOf(enteredText().contains(charText));
        containsTxt.setText(contains);
    }

    private void emptyText() {
        String empty = String.valueOf(enteredText().isEmpty());
        emptyTxt.setText(empty);
    }

    private void trimText() {
        String trim = enteredText().trim();
        trimTxt.setText(trim);
    }

    private void getLength() {
        String length = String.valueOf(enteredText().length());
        lengthTxt.setText(length);
    }

    private void convertToLowerCASE() {
        String lowerCase = enteredText().toLowerCase();
        lowerCaseTxt.setText(lowerCase);
    }

    private void convertToUppercase() {
        String upperCase = enteredText().toUpperCase();
        upperTxt.setText(upperCase);
    }

    private void initViews() {
        textTxt = findViewById(R.id.text_txt);
        upperTxt = findViewById(R.id.upper_txt);
        submitBtn = findViewById(R.id.submit_btn);
        lowerCaseTxt = findViewById(R.id.lower_case_txt);
        lengthTxt = findViewById(R.id.length_txt);
        trimTxt = findViewById(R.id.trim_txt);
        emptyTxt = findViewById(R.id.empty_txt);
        containsTxt = findViewById(R.id.contains_txt);
        charTxt = findViewById(R.id.char_txt);
        letterTxt = findViewById(R.id.letter_txt);
        startWithTxt = findViewById(R.id.start_with_txt);
        letterWithTxt = findViewById(R.id.letter_with_txt);
        endWithTxt = findViewById(R.id.end_with_txt);
        letterIndexTxt = findViewById(R.id.letter_index_txt);
        indexTxt = findViewById(R.id.index_txt);
        letterReplaceTxt = findViewById(R.id.letter_replace_txt);
        replaceTxt = findViewById(R.id.replace_txt);
        letterLastTxt = findViewById(R.id.letter_last_txt);
        lastIndexTxt = findViewById(R.id.last_index_txt);
    }

    public String enteredText() {
        String Text = textTxt.getText().toString();
        return Text;
    }
}