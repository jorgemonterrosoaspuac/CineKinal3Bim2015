package gt.edu.kinal.jmonterroso.movies;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

    private Toolbar myToolBar;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myToolBar = (Toolbar)findViewById(R.id.toolbar);
        btnLogin = (Button)findViewById(R.id.logins);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = ((EditText)findViewById(R.id.userText)).getText().toString();
                String pass_name = ((EditText)findViewById(R.id.passText)).getText().toString();
                if(user_name.equals("Admin") && pass_name.equals("Admin")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText( getApplicationContext() , "Error al iniciar Sesion", Toast.LENGTH_SHORT).show();
                }
            }
        });

        setSupportActionBar(myToolBar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Item Ajustes", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.register){
            Intent intenRegister = new Intent(LoginActivity.this , Register.class);
            Toast.makeText(getApplicationContext(), "Accediendo al Registro", Toast.LENGTH_SHORT).show();
            startActivity(intenRegister);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
