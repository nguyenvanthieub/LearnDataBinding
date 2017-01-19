package com.thieumao.learndatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.thieumao.learndatabinding.databinding.ItemRecyclerViewUserBinding;

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
        ItemRecyclerViewUserBinding binding = DataBindingUtil.inflate(mLayoutInflater, R.layout.item_recycler_view_user, parent, false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = mUserList.get(position);
        holder.getBinding().setVariable(BR.user, user);
    }


    @Override
    public int getItemCount() {
        return mUserList != null ? mUserList.size() : 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding mBinding;

        public UserViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public ViewDataBinding getBinding() {
            return mBinding;
        }
    }
}
