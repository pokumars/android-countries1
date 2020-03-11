package com.pokumars.countrylist.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.pokumars.countrylist.R
import android.graphics.drawable.PictureDrawable
import android.net.Uri
import com.bumptech.glide.load.model.StreamEncoder
import java.io.InputStream
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.SimpleResource
import com.bumptech.glide.load.ResourceDecoder
import androidx.annotation.NonNull
import com.bumptech.glide.load.Options
import com.bumptech.glide.load.engine.Resource
import java.io.IOException
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import android.graphics.Picture
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder
import androidx.annotation.Nullable
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.ImageViewTarget


fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}

//Here we create anew function to add unto Imageview that makes it use Glide and thus
// we can add functionality to how the image loads
fun ImageView.loadImage(uri: String?, progressDrawable: CircularProgressDrawable){

    val options = RequestOptions()
        .placeholder(progressDrawable)//show this while it loads
        .error(R.drawable.ic_flag)//show this if error

    //use Glide to load image into the image view
    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(uri)
        .into(this)
}
/*
//we can make extensions for classes we do not own and define functionality for them.
// In this case we are going to do that for the imageview so it has a progress spinner
// and a placeholder image in case of errors
fun ImageView.loadImage(uri: String?, progressDrawable: CircularProgressDrawable){

    GenericRequestBuilder<Uri,InputStream,SVG,PictureDrawable>
        requestBuilder = Glide.with(context)
        .using(Glide.buildStreamModelLoader(Uri.class, context), InputStream.class)
        .from(Uri.class)
        .as(SVG.class)
        .transcode(new SvgDrawableTranscoder(), PictureDrawable.class)
        .sourceEncoder(new StreamEncoder())
        .cacheDecoder(new FileToStreamDecoder<SVG>(new SvgDecoder()))
        .decoder(new SvgDecoder())
        .placeholder(R.drawable.svg_image_view_placeholder)
        .error(R.drawable.error_image)
        .listener(new SvgSoftwareLayerSetter<Uri>());

    Uri uri = Uri.parse(svgImageUrl);
    requestBuilder
        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
        .load(uri)
        .into(imageView);

    val options = RequestOptions()
        .placeholder(progressDrawable)//show this while it loads
        .error(R.drawable.ic_flag)//show this if error

    //use Glide to load image into the image view
    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(uri)
        .into(this)
}

/** Decodes an SVG internal representation from an [InputStream].  */
class SvgDecoder : ResourceDecoder<InputStream, SVG> {

    override fun handles(@NonNull source: InputStream, @NonNull options: Options): Boolean {
        // TODO: Can we tell?
        return true
    }

    @Throws(IOException::class)
    override fun decode(
        @NonNull source: InputStream, width: Int, height: Int, @NonNull options: Options
    ): Resource<SVG> {
        try {
            val svg = SVG.getFromInputStream(source)
            return SimpleResource<SVG>(svg)
        } catch (ex: SVGParseException) {
            throw IOException("Cannot load SVG from stream", ex)
        }

    }
}

/**
 * Convert the [SVG]'s internal representation to an Android-compatible one ([Picture]).
 */
class SvgDrawableTranscoder : ResourceTranscoder<SVG, PictureDrawable> {
    @Nullable
    override fun transcode(
        toTranscode: Resource<SVG>, options: Options
    ): Resource<PictureDrawable>? {
        val svg = toTranscode.get()
        val picture = svg.renderToPicture()
        val drawable = PictureDrawable(picture)
        return SimpleResource(drawable)
    }
}

internal class SvgSoftwareLayerSetter: RequestListener<PictureDrawable> {
    override fun onLoadFailed(
        e: GlideException?,
        model: Any?,
        target: com.bumptech.glide.request.target.Target<PictureDrawable>?,
        isFirstResource: Boolean
    ): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun onLoadFailed(
        e:GlideException, model:Any, target:Target<PictureDrawable>, isFirstResource:Boolean):Boolean {
        val view = (target as ImageViewTarget<*>).getView()
        view.setLayerType(ImageView.LAYER_TYPE_NONE, null)
        return false
    }
    override fun onResourceReady(
        resource:PictureDrawable,
        model:Any,
        target:Target<PictureDrawable>,
        dataSource:DataSource,
        isFirstResource:Boolean):Boolean {
        val view = (target as ImageViewTarget<*>).getView()
        view.setLayerType(ImageView.LAYER_TYPE_SOFTWARE, null)
        return false
    }
}*/