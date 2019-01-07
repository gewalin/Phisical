package gewalin.th.ac.rmutl.phisical;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapterVideo extends ArrayAdapter<String> {

    String[] nameVideo;
    int[] imagevideo;
    Context vcontext;

    public MyAdapterVideo(Context context, String[] countryNameVideo,int[] countryImageVideo) {
        super(context, R.layout.listview_item_video);
        this.nameVideo = countryNameVideo;
        this.imagevideo = countryImageVideo;
        this.vcontext = context;
    }

    @Override
    public int getCount() {
        return nameVideo.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyAdapterVideo.ViewHolder holder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) vcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item_video, parent, false);
            holder.mImage = (ImageView) convertView.findViewById(R.id.imageViewVideo);
            holder.mNamevideo = (TextView) convertView.findViewById(R.id.textViewVideo);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mImage.setImageResource(imagevideo[position]);
        holder.mNamevideo.setText(nameVideo[position]);

        return convertView;
    }

    static class ViewHolder {
        ImageView mImage;
        TextView mNamevideo;
    }

}
