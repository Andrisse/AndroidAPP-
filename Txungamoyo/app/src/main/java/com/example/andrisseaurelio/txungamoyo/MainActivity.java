package com.example.andrisseaurelio.txungamoyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.webview);

        webSttings WebSettings = myWebView.getSettings();
        //habilitar o javascript

        webSettings.setJavaSriptEnabled(true);

        List<Items> items = todosOsItems();
        ArrayAdapter<items> adapter = new ArrayAdapter<items>(this,;
        android.R.layout.simple_list_item_1, items);

        items.setAdapter(adapter);


    }
    items = (ListView) findViewById( R.id.items );
    items.setOnItemClickListener( new AdapterView.OnItemClickListener()
                        @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                     long arg3) {
                            tratarOpcoesItem( arg2 );

                            }
                 } );

            }
protected void tratarOpcoesItem( int posicao ) {
        int posItem = posicao + 1;
        Toast.makeText( this, "Posição na lista: " + posItem , Toast.LENGTH_LONG ).show();

        }

public boolean onCreateOptionsMenu(Menu menu){
         getMenuIflater().inflate(R.menu.main, menu)
                 return true;

    }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id== R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSlected(item);
    }
    public void click(View view) {
        android.widget.Toast.makeText(this, "Vce pressionou o botao", Toast.LENGTH_SHORT).show();
    }

}

   private String Usuario;
   private String Senha;

   public String getUsuario()
        {
        return Usuario;
        }
    public void setUsuario(String usuario)
        {
        Usuario = usuario;
        }
  public String getSenha()
        {
        return Senha;
        }
  public void setSenha(String senha)
        {
        Senha = senha;
        }

  public boolean ValidarUsuario()
        {
        if (Usuario.equals(""))
        {
        return false;
        }
        else if (Senha.equals(""))
        {
        return false;
        }
        else if (!Usuario.equals(USUARIO) || !Senha.equals(SENHA))
        {
        return false;
        }
        else
        {
        return true;
        }
        }