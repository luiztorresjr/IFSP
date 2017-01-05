package br.com.klon.bancodados;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import br.com.klon.bancodados.domain.Departamento;

/**
 * Created by Luiz on 08/04/2016.
 */
public class DepartamentoAdapter extends BaseAdapter {
    private List<Departamento> departamentos;
    private Context context;

    public DepartamentoAdapter(List<Departamento> departamentos, Context context) {
        this.departamentos = departamentos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return departamentos.size();
    }

    @Override
    public Object getItem(int position) {
        return departamentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater
        return view;
    }
}
