# DiscussionAvatarView
Android自定义控件_讨论组圆形头像叠加控件DiscussionAvatarView，显示多个参与讨论的人的头像

<a href="https://github.com/hnsycsxhzcsh/DiscussionAvatarView/blob/master/mysrc/discussionavatar.apk">Download Apk</a>

效果图

<img src="https://github.com/hnsycsxhzcsh/DiscussionAvatarView/blob/master/mysrc/discussionavatar.gif" width="300" height="612">

项目中引用的方法：

步骤1.将JitPack存储库添加到构建文件中

项目的根build.gradle中添加以下代码：

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

步骤2.build.gradle添加依赖项

	dependencies {
	        implementation 'com.github.hnsycsxhzcsh:DiscussionAvatarView:1.1'
	}

步骤3. 布局中引用控件

    <com.discussionavatarview.DiscussionAvatarView
        android:id="@+id/daview"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        app:isLastComplete="true"
        app:isShowAnimation="true"
        app:maxCount="6"
        app:radius="30"
        app:space="0.5">
       
步骤4. 新增头像使用addData方法，DiscussionAvatarListener(可以不加)为动画效果的监听

    mBtAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://b-ssl.duitang.com/uploads/item/201807/11/20180711091152_FakCJ.thumb.700_0.jpeg";
                mDiscussAva.addData(url, new DiscussionAvatarListener() {
                    @Override
                    public void onAnimationStart() {

                    }

                    @Override
                    public void onAnimationEnd() {

                    }
                });
            }
        });

<font color="#FF0000">如果有帮助到大家希望点下右上角Star，谢谢！</font>
