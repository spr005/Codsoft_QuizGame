// Generated by view binder compiler. Do not edit!
package com.example.quizgame.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.quizgame.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityQuizBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final RadioButton rb1;

  @NonNull
  public final RadioButton rb2;

  @NonNull
  public final RadioButton rb3;

  @NonNull
  public final RadioButton rb4;

  @NonNull
  public final RadioGroup rgMain;

  @NonNull
  public final TextView tvFeedback;

  @NonNull
  public final TextView tvQuestion;

  private ActivityQuizBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSubmit,
      @NonNull RadioButton rb1, @NonNull RadioButton rb2, @NonNull RadioButton rb3,
      @NonNull RadioButton rb4, @NonNull RadioGroup rgMain, @NonNull TextView tvFeedback,
      @NonNull TextView tvQuestion) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.rb1 = rb1;
    this.rb2 = rb2;
    this.rb3 = rb3;
    this.rb4 = rb4;
    this.rgMain = rgMain;
    this.tvFeedback = tvFeedback;
    this.tvQuestion = tvQuestion;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityQuizBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityQuizBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_quiz, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityQuizBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSubmit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.rb1;
      RadioButton rb1 = ViewBindings.findChildViewById(rootView, id);
      if (rb1 == null) {
        break missingId;
      }

      id = R.id.rb2;
      RadioButton rb2 = ViewBindings.findChildViewById(rootView, id);
      if (rb2 == null) {
        break missingId;
      }

      id = R.id.rb3;
      RadioButton rb3 = ViewBindings.findChildViewById(rootView, id);
      if (rb3 == null) {
        break missingId;
      }

      id = R.id.rb4;
      RadioButton rb4 = ViewBindings.findChildViewById(rootView, id);
      if (rb4 == null) {
        break missingId;
      }

      id = R.id.rgMain;
      RadioGroup rgMain = ViewBindings.findChildViewById(rootView, id);
      if (rgMain == null) {
        break missingId;
      }

      id = R.id.tvFeedback;
      TextView tvFeedback = ViewBindings.findChildViewById(rootView, id);
      if (tvFeedback == null) {
        break missingId;
      }

      id = R.id.tvQuestion;
      TextView tvQuestion = ViewBindings.findChildViewById(rootView, id);
      if (tvQuestion == null) {
        break missingId;
      }

      return new ActivityQuizBinding((ConstraintLayout) rootView, btnSubmit, rb1, rb2, rb3, rb4,
          rgMain, tvFeedback, tvQuestion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}