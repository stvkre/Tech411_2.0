package com.stvkre.tech411;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mBlogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBlogList = (RecyclerView) findViewById(R.id.blog_list);
        mBlogList.setHasFixedSize(true);
        mBlogList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public static class blogViewHolder extends RecyclerView.ViewHolder {

        View mView;

        public blogViewHolder(View itemView) {
            super(itemView);

            itemView = mView;
        }

        public void setTitle(String title) {
            TextView post_title = (TextView) mView.findViewById(R.id.post_title);
        }
    }
}
