package com.kimeeo.jsInterface;

import android.app.Activity;

/**
 * Created by BhavinPadhiyar on 02/07/16.
 */
public class Example {
    JSONTransform jsonTransform;
    public Example(Activity activity)
    {
        jsonTransform=new JSONTransform(R.raw.php_crud_api_transform,activity,new String[]{"php_crud_api_transform"});
    }
    public String callFunction()
    {
        String jsontext ="{\"post\":{\"columns\":[\"id_post\",\"id_user\"],\"records\":[[\"2\",\"2\"]]},\"users\":{\"relations\":{\"id_user\":\"post.id_user\"},\"columns\":[\"id_user\",\"first_name\",\"photo\"],\"records\":[[\"2\",null,null]]},\"files\":{\"relations\":{\"id_post\":\"post.id_post\",\"id_user\":\"users.id_user\"},\"columns\":[\"id_files_data\",\"id\",\"id_user\",\"id_post\",\"id_event\",\"id_resource\",\"id_photo_album\",\"id_resource_data\",\"label\",\"url\",\"preview\",\"size\",\"color\",\"w\",\"h\",\"is_attachment\",\"is_video\",\"location\",\"longitude\",\"latitude\",\"time_stamp\"],\"records\":[[\"1\",null,\"2\",\"2\",null,null,null,null,\"OK\",null,null,null,null,null,null,null,null,null,null,null,\"2016-06-02 13:11:17\"],[\"2\",null,\"10\",\"2\",null,null,null,null,\"NEW FILE\",null,null,null,null,null,null,null,null,null,null,null,\"2016-06-14 05:51:18\"]]}}";
        String data=jsonTransform.call("php_crud_api_transform",new Object[]{jsontext}).toString();
        data=jsonTransform.transform(jsontext);
        return data;
    }
}
