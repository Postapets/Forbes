package com.example.forbes;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
public class PersonAdapter extends ArrayAdapter<Person>{
        //Подключение адаптера к xml, который будет содержать данные
        public PersonAdapter(Context context, Person[] arr) {
            super(context, R.layout.list_item, arr);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            final Person person = getItem(position);

            if (convertView == null) {
                //подвязываем конверт
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
            }

            // Заполняем адаптер, привязываем к соответствующим полям в list_item соответствующие поля полученного класса
            ((TextView) convertView.findViewById(R.id.name)).setText(person.name);
            ((TextView) convertView.findViewById(R.id.money)).setText(String.valueOf(person.money));
            ((ImageView) convertView.findViewById(R.id.flag)).setImageResource(person.flag_res);

            return convertView;
        }
    }

