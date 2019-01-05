package gewalin.th.ac.rmutl.phisical;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String>{

    String[] nameTitle;
    String[] nameSubtitle;
    int[] flags;
    Context scontext;

    public MyAdapter(Context context, String[] countryNames, String[] countryNamesSubtitle, int[] countryFlags) {
        super(context, R.layout.listview_item);
        this.nameTitle = countryNames;
        this.nameSubtitle = countryNamesSubtitle;
        this.flags = countryFlags;
        this.scontext = context;
    }

    @Override
    public int getCount() {
        return nameTitle.length;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) scontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            holder.mFlag = (ImageView) convertView.findViewById(R.id.imageView);
            holder.mName = (TextView) convertView.findViewById(R.id.textViewTitle);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

            holder.mFlag.setImageResource(flags[position]);
            holder.mName.setText(nameTitle[position]);

        return convertView;
    }

    static class ViewHolder {
        ImageView mFlag;
        TextView mName, mNameSub;
    }
}
