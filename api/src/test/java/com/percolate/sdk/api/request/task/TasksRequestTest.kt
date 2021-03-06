package com.percolate.sdk.api.request.task

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.Task
import org.junit.Assert
import org.junit.Test

class TasksRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val tasks = percolateApi
                .tasks()
                .get(TasksParams())
                .execute()
                .body();

        Assert.assertNotNull(tasks)
        Assert.assertNotNull(tasks.data)
        Assert.assertEquals(3, tasks.data.size.toLong())
    }

    @Test
    fun testCreate() {
        val singleTask = percolateApi
                .tasks()
                .create(Task())
                .execute()
                .body();

        Assert.assertNotNull(singleTask)
        Assert.assertNotNull(singleTask.data)
        Assert.assertNotNull(singleTask.data.id)
    }

    @Test
    fun testUpdate() {
        val singleTask = percolateApi
                .tasks()
                .update(Task().apply { id= "123" })
                .execute()
                .body();

        Assert.assertNotNull(singleTask)
        Assert.assertNotNull(singleTask.data)
        Assert.assertNotNull(singleTask.data.id)
    }

    @Test
    fun testDelete() {
        val responseBody = percolateApi
                .tasks()
                .delete(TasksDeleteParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(responseBody)
    }
}
