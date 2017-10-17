package in.alganext.ugp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends Activity {
    private File imageFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void picture(View v)
    {
        Intent intn=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        imageFile= new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),"test.jpg");
        Uri tempuri=Uri.fromFile(imageFile);
        intn.putExtra(MediaStore.EXTRA_OUTPUT,tempuri);
        intn.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,1);
        startActivityForResult(intn,0);



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      /*  if(requestCode==0)
        {
            switch (resultCode){
                case -1:
                    if (imageFile.exists()) {Toast.makeText(this,"The File Was Saved At"+imageFile.getAbsolutePath(),Toast.LENGTH_LONG).show();}

                    else {
                        Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
                    }

                    break;

                case 0:

                    break;

                default:

                    break;
            }
        }
*/

     //String S=resultCode+"";

       //Toast.makeText(this,S,Toast.LENGTH_LONG).show();

       //System.out.print("Result Code"+resultCode);
        // If image taken -1 not taken 0

        //Toast.makeText(this,"The File Was Saved At"+imageFile.getAbsolutePath(),Toast.LENGTH_LONG).show();
    }
}
