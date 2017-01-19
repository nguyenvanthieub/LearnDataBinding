package com.thieumao.learndatabinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nguyen.van.thieub on 1/19/17.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> mUserList;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public UserAdapter(Context context, List<User> userList) {
        mUserList = userList;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(mLayoutInflater.inflate(R.layout.item_recycler_view_user, parent, false));
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = mUserList.get(position);
        holder.mTextViewFirstName.setText(user.getFirstName());
        holder.mTextViewLastName.setText(user.getLastName());
    }

    @Override
    public int getItemCount() {
        return mUserList != null ? mUserList.size() : 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewLastName;
        private TextView mTextViewFirstName;

        public UserViewHolder(View itemView) {
            super(itemView);
            mTextViewFirstName = (TextView) itemView.findViewById(R.id.text_first_name);
            mTextViewLastName = (TextView) itemView.findViewById(R.id.text_last_name);
        }
    }
}
