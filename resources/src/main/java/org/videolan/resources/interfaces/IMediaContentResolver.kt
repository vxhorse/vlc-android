package org.videolan.resources.interfaces

import android.content.Context
import org.videolan.medialibrary.interfaces.media.MediaWrapper

typealias ResumableList = Pair<List<MediaWrapper>, Int>?

interface IMediaContentResolver {
    suspend fun getList(context: Context, id: String) : ResumableList
}