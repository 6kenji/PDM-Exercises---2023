// Generated by view binder compiler. Do not edit!
package mz.co.aulas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mz.co.aulas.R;

public final class ActivityAula5IntentTestBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnOpenWeb;

  @NonNull
  public final TextView idadeTv;

  @NonNull
  public final TextView nomeTv;

  private ActivityAula5IntentTestBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnOpenWeb, @NonNull TextView idadeTv, @NonNull TextView nomeTv) {
    this.rootView = rootView;
    this.btnOpenWeb = btnOpenWeb;
    this.idadeTv = idadeTv;
    this.nomeTv = nomeTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAula5IntentTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAula5IntentTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_aula5_intent_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAula5IntentTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnOpenWeb;
      Button btnOpenWeb = ViewBindings.findChildViewById(rootView, id);
      if (btnOpenWeb == null) {
        break missingId;
      }

      id = R.id.idade_tv;
      TextView idadeTv = ViewBindings.findChildViewById(rootView, id);
      if (idadeTv == null) {
        break missingId;
      }

      id = R.id.nome_tv;
      TextView nomeTv = ViewBindings.findChildViewById(rootView, id);
      if (nomeTv == null) {
        break missingId;
      }

      return new ActivityAula5IntentTestBinding((ConstraintLayout) rootView, btnOpenWeb, idadeTv,
          nomeTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
