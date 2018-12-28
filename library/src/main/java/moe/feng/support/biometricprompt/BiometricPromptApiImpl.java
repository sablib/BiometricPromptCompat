package moe.feng.support.biometricprompt;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

public final class BiometricPromptApiImpl implements IBiometricPromptImpl {
    private final Context context;

    BiometricPromptApiImpl(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void authenticate(@Nullable BiometricPromptCompat.ICryptoObject crypto, @Nullable CancellationSignal cancel, @NonNull BiometricPromptCompat.IAuthenticationCallback callback) {
        callback.onAuthenticationError(BiometricPromptCompat.BIOMETRIC_ERROR_HW_NOT_PRESENT, "");
    }
}
