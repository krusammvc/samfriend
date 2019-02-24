package mvc.ac.th.samfriend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyAlert {
    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }

    public void normalDialog(String title, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
}
