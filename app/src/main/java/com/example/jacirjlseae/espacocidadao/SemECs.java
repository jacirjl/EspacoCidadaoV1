package com.example.jacirjlseae.espacocidadao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SemECs extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_ecs);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng coordenadas;

        //SEAE
        coordenadas = new LatLng(-25.4150836, -49.2696057);
        mMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title("Curitiba – SECRETARIA DE ASSUNTOS ESTRATÉGICOS – SEAE")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(coordenadas));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(10));

        coordenadas = new LatLng(-24.7593123, -48.83974030000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Adrianópolis").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.9881964, -49.33478279999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Agudos do Sul").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.2985567, -49.34501119999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Almirante Tamandaré").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.5086071, -53.7290395);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Alto Paraíso").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.0943485, -53.41220520000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Alto Piquiri").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.8729539, -53.89334229999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Altônia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-22.7960186, -51.24223949999998);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Alvorada do Sul").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.047934, -50.23066749999998);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Andirá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.4328356, -48.71620669999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Antonina").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.9745743, -50.14208819999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Antônio Olinto").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.5504385, -51.463971600000036);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Apucarana").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.4157731, -51.4264048);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Arapongas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.2400211, -51.6639768);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Astorga").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.0287339, -52.01375469999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Barbosa Ferraz").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.1165207, -50.184636100000034);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Barra do Jacaré").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.2071511, -49.11409979999996);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Bocaiúva do Sul").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.7277649, -51.83114410000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Bom Sucesso").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.1710055, -53.5419225);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Brasilândia do Sul").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.6605742, -51.326047200000005);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Califórnia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.0465199, -50.07202819999998);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Cambará").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.5653769, -51.33767839999996);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Cândido de Abreu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.8928967, -49.24359979999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Cerro Azul").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.6602731, -52.606864599999994);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Cianorte").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.5704567, -50.5549719);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Congonhinhas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.6793029, -49.53552250000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Contenda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.7650935, -53.26115140000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Corbélia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-26.2168483, -51.89455050000004);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Coronel Domingos Soares").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.979821, -52.567801599999996);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Coronel Vivida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.9408107, -54.10658639999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Diamante D’Oeste").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-22.657229, -52.86114359999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Diamante do Norte").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.7065631, -54.24331129999996);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Entre Rios do Oeste").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.4221149, -52.83530139999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Espigão Alto do Iguaçu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.848706, -50.40603870000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Figueira").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.2742123, -53.32585130000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Formosa do Oeste").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-26.0404504, -53.17497259999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Francisco Beltrão").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-22.9144581, -52.745593499999984);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Guairaçá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.3907214, -51.46280969999998);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Guarapuava").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.2445091, -48.31902760000003);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Guaraqueçaba").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.8804742, -48.57376620000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Guaratuba").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.4422962, -50.741670699999986);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Imbaú").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.0253304, -50.5835338);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Ipiranga").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.0022671, -53.7086807);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Iporã").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.4700302, -50.65094590000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Irati").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.1362597, -54.368580899999984);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Itaipulândia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-22.9911548, -50.41014740000003);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Itambaracá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.1169056, -49.50763919999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Itaperuçu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.3170965, -52.52754519999996);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Mamborê").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.7775289, -49.32870220000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Mandirituba").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.0074176, -53.147911499999964);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Mariluz").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.8322614, -48.53804539999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Matinhos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.4314063, -54.193822100000034);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Mercedes").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.0914713, -54.2474972);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Missal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.1891863, -52.200489300000015);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Nova Esperança").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.9034897, -53.26115140000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Nova Esperança do Sudoeste").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.6035708, -53.34743040000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Nova Prata do Iguaçu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.593655, -50.731283899999994);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Nova Santa Bárbara").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.4130078, -53.97591390000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Nova Santa Rosa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.6283084, -54.22640130000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Pato Bragado").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-22.7713328, -53.26660300000003);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Porto Rico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.248631, -52.12754810000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Presidente Castelo Branco").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.3678092, -49.07677949999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Quatro Barras").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.5769069, -53.97591390000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Quatro Pontes").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.0984121, -50.908091300000024);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Rancho Alegre").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-26.1582129, -52.97133769999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Renascença").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.8418958, -51.97918490000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Reserva do Iguaçu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.4897589, -52.527345999999966);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Rio Bonito do Iguaçu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.3545342, -51.305085099999985);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Rio Branco do Ivaí").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.12785, -49.24359979999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Rio Branco do Sul").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-26.1130593, -49.670720500000016);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Rio Negro").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.0677201, -50.53426200000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Santa Mariana").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.4768675, -54.41233030000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Santa Terezinha de Itaipu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.8276559, -52.72477479999998);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São João").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.9916252, -51.81938709999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São João do Ivaí").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.686939, -50.30051689999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São João do Triunfo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.7649394, -53.878365299999984);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São Jorge do Patrocínio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.8178205, -54.10658639999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São José das Palmeiras").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.5318354, -49.203572199999996);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São José dos Pinhais").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.8681839, -50.38423160000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São Mateus do Sul").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.8606851, -51.87340840000002);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São Pedro do Ivaí").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-22.7865542, -53.17497259999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("São Pedro do Paraná").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.4445928, -51.87650439999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Sarandi").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.6736555, -49.79332790000001);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Siqueira Campos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.1617173, -54.09814159999996);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Terra Roxa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.5156508, -50.411922900000036);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Tibagi").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-24.7251855, -53.74185139999997);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Toledo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.7786372, -49.95427289999998);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Tomazina").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.9120419, -52.83126609999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Tuneiras do Oeste").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-23.7661064, -53.32061049999999);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Umuarama").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        coordenadas = new LatLng(-25.4239714, -50.0044697);
        mMap.addMarker(new MarkerOptions().position(coordenadas).title("Palmeira").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));


    }
}
