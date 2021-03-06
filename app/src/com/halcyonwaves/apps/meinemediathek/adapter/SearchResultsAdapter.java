package com.halcyonwaves.apps.meinemediathek.adapter;

import java.util.List;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.halcyonwaves.apps.meinemediathek.R;
import com.halcyonwaves.apps.meinemediathek.SearchResultEntry;

public class SearchResultsAdapter extends ArrayAdapter< SearchResultEntry > {

	private final LayoutInflater mInflater;

	public SearchResultsAdapter( final Context context ) {
		super( context, R.layout.lvr_searchresults );
		this.mInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
	}

	@Override
	public View getView( final int position, final View convertView, final ViewGroup parent ) {
		View view;

		if( convertView == null ) {
			view = this.mInflater.inflate( R.layout.lvr_searchresults, parent, false );
		} else {
			view = convertView;
		}

		final SearchResultEntry item = this.getItem( position );
		((TextView) view.findViewById( R.id.tv_episode_title )).setText( item.title );
		((TextView) view.findViewById( R.id.tv_episode_description )).setText( item.description );
		((ImageView) view.findViewById( R.id.iv_episode_image )).setImageURI( Uri.parse( item.previewImage.toURI().toString() ) );

		return view;
	}

	public void setData( final List< SearchResultEntry > data ) {
		this.clear();
		if( data != null ) {
			this.addAll( data );
		}
	}
}
