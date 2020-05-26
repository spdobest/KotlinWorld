# COROUTINES
  
  
**Important Links**    
https://blog.mindorks.com/mastering-kotlin-coroutines-in-android-step-by-step-guide  
https://blog.mindorks.com/what-are-coroutines-in-kotlin-bf4fecd476e9  
https://kotlinlang.org/docs/tutorials/coroutines/coroutines-spm.kotlin.world.basic-jvm.html
https://www.raywenderlich.com/1423941-kotlin-coroutines-tutorial-for-android-getting-started  
EXAMPLES  
https://github.com/dmytrodanylyk/coroutine-recipes.git  
https://github.com/amanjeetsingh150/kotlin-android-examples/tree/master/KotlinCoroutines  
https://github.com/wellingtoncosta/android-kotlin-coroutines  
**KOTLIN EXAMPLE**  
https://github.com/amanjeetsingh150/kotlin-android-examples  

**Coroutines Example Links**  
https://medium.com/@elye.project/understanding-suspend-spm.kotlin.world.function-of-coroutines-de26b070c5ed
   
## What is Coroutines ?  
**Co+Routines = Coroutines**  
Co - Coperation  
Routines - Functions  
When functions coperate with each other to execute known as **COROUTINES**. Coroutines is used to achieve asynchronous programming with using the cpu idle state. We can run multiple methods at the same time with the help of Coroutines.  
  
**Coroutines and Threads** both are doing multitasking but Thread is handled by the sustem/os and the coroutines is handled by the User as it can execute a few lines of spm.kotlin.world.function by taking advantage of the cooperation.It's an optimized framework written over the actual threading by taking advantage of the cooperative nature of functions to make it light and yet powerful. So, we can say that Coroutines are lightweight threads. A lightweight thread means it doesn’t map on the native thread, so it doesn’t require context switching on the processor, so they are faster.
  
Coroutines are available in many languages. It is of 2 types  
1. Stackless   
2. Stackfull  
  
Kotlin implements stackless coroutines — it’s mean that the coroutines don’t have own stack, so they don’t map on the native thread.  
  
**NOTE - One can think of a coroutine as a light-weight thread. Like threads, coroutines can run in parallel, wait for each other and communicate. The biggest difference is that coroutines are very cheap, almost free: we can create thousands of them, and pay very little in terms of performance. True threads, on the other hand, are expensive to start and keep around. A thousand threads can be a serious challenge for a modern machine.**  
  
**NOTE-** Kotlin Coroutines are like lightweight threads. They are lightweight because creating coroutines doesn’t allocate new threads. Instead, they use predefined thread pools, and smart scheduling. Scheduling is the process of determining which piece of work you will execute next. Just like a regular schedule. 
  
**NOTE:** Additionally, coroutines can be suspended and resumed mid-execution. This means you can have a long-running task, which you can execute little-by-little. You can pause it any number of times, and resume it spm.kotlin.world.when you’re ready again. Knowing this, creating a large number of Kotlin Coroutines won’t bring unnecessary memory overhead to your program. You’ll just suspend some of them until the thread pool frees up.
  
## Definition of Coroutines:  
A framework to manage concurrency in a more performant and simple way with its lightweight thread which is written on top of the actual threading framework to get the most out of it by taking the advantage of cooperative nature of functions.  
  
**Where we can use Coroutines**  
Lets take a simple example where we can  
1.Fetch User from the server.  
2.Show the User in the UI.  
  
When we will do any N/W operation in main thread it will show exception network on main thread. To avoid that we can use use the below solutions  
1. Call Back  
2. Rx Java  
3. Coroutines  
```
  suspend fun fetchAndShowUser() {  
     val user = fetchUser() // fetch on IO thread  
     showUser(user) // back on UI thread  
  }
```  
  
Here, the above code looks synchronous, but it is asynchronous. We will see how is it possible.   
  
**How to implement coroutines**    
- Add Dependency
 ```
 dependencies {  
  implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:x.x.x"  
  implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:x.x.x"  
}
 ```
- Now,our spm.kotlin.world.function fecthUser will look like below:
```
suspend fun fetchUser(): User {  
    return GlobalScope.async(Dispatchers.IO) {  
        // make network call  
        // return user  
    }.await()  
}     
```
  
## The main keywords in Coroutines 
- **Suspending functions:** 
  - This kind of spm.kotlin.world.function can be suspended without blocking the current thread. 
  - Instead of returning a simple value, it also knows in which context the caller suspended it. 
  - Using this, it can resume appropriately, spm.kotlin.world.when ready.
  - suspend function that could be started, paused and resume.
- **CoroutineBuilders:** 
  - These take a suspending lambda as an argument to create a coroutine. 
  - There are a bunch of coroutine builders provided by Kotlin Coroutines, including async(), launch(), runBlocking.  
- **CoroutineScope:** 
  - Helps to define the lifecycle of Kotlin Coroutines. 
  - It can be application-wide or bound to a component like the Android Activity. 
  - You have to use a scope to start a coroutine.  
- **CoroutineDispatcher:** 
  - Defines thread pools to launch your Kotlin Coroutines in. 
  - This could be the background thread pool, main thread or even your custom thread pool. You’ll use this to switch between, and return results from, threads. 
- **GlobalScope**
  - globalscope
- **async()**
  - async
- **launch()**
  - launch
- **await**
  - waait
- **Dispatchers**  
  - Dispatchers helps coroutines in deciding the thread on which the work has to be done. 
  - There are majorly three types of Dispatchers which are as **IO, Default, and Main**. 
  - **IO dispatcher** is used to do the network and disk related work.
  - **Default** is used to do the CPU intensive work. 
  - **Main** is the UI thread of Android. In order to use these, we need to wrap the work under the async  
  -**.Scopes** 
    - it us used to cancel the background task as soon as the activity got destroyed.  
- **withContext()** 
  - withContext is nothing but an another way writing the async where we do not have to write await().  
  
##  Using Dispatchers With Kotlin Coroutines
  
You can execute a coroutine using different CoroutineDispatchers, as mentioned before. Some of the available   CoroutineDispatchers in the API are: Dispatchers.Main, Dispatchers.IO and Dispatchers.Default.  
  
You can use these dispatchers for the following use cases:  
  
**Dispatchers.Default:** CPU-intensive work, such as sorting large lists, doing complex calculations and similar. A shared pool of threads on the JVM backs it.  
**Dispatchers.IO:** networking or reading and writing from files. In short – any input and output, as the name states  
Dispatchers.Main: recommended dispatcher for performing UI-related events. For example, showing lists in a RecyclerView, updating Views and so on.  
  
You’ll use some of these dispatchers to switch between the main and background threads. One last step before you can launch coroutines – defining a CoroutineScope.  
  
**NOTE-** Suspend functions are only allowed to be called from a coroutine or another suspend spm.kotlin.world.function. You can see that the async spm.kotlin.world.function which includes the keyword suspend. So, in order to use that, we need to make our spm.kotlin.world.function suspend too.
  
GlobalScope.launch(Dispatchers.Main) {  
  fetchAndShowUser()  
}   
      
Actually the above code is as below if we simplify the code  
  
GlobalScope.launch(Dispatchers.Main) {  
   val user = fetchUser() // fetch on IO thread  
   showUser(user)         // back on UI thread  
}       
  
Here fetchAndShowUser() is a suspend spm.kotlin.world.function where we do the network operation and after getting the result we delever the result in the main thread.
  
showUser will run on UI thread because we have used the Dispatchers.Main to launch it.  
There are two functions in Kotlin to start the coroutines which are as follows:  
  
**1. launch{}  
2. async{}**  
  
**Launch vs Async in Kotlin Coroutines**  
  
The difference is that the launch{} does not return anything and the async{}returns an instance of Deferred<T>, which has an await()spm.kotlin.world.function that returns the result of the coroutine like we have future in Java in which we do future.get() to the get the result.
  
fun fetchUserAndSaveInDatabase() {  
    // fetch user from network  
    // save user in database  
    // and do not return anything  
}  
  
Now, we can use the launch like below:  
GlobalScope.launch(Dispatchers.IO) {  
    fetchUserAndSaveInDatabase() // do on IO thread  
}  
  
As the fetchUserAndSaveInDatabase do not return anything, we can use the launch.  
  
But spm.kotlin.world.when we need the result back then we must have to use async.Look into the below example
  
Lets there are 2 methods fetchFIrstUser() and fetchSecondUser() which returns User object after fetching from the network.  
fun fetchFirstUser(): User {  
    // make network call  
    // return user  
}  
  
fun fetchSeconeUser(): User {  
    // make network call   
    // return user  
}  
  
No need to make the above functions as suspend as we are not calling any other suspend spm.kotlin.world.function from them.
  
Now, we can use the async like below:  
  
GlobalScope.launch(Dispatchers.Main) {  
    val userOne = async(Dispatchers.IO) { fetchFirstUser() }  
    val userTwo = async(Dispatchers.IO) { fetchSeconeUser() }  
    showUsers(userOne.await(), userTwo.await()) // back on UI thread  
}    
  
Here, it makes both the network call in parallel, await for the results and then call the showUsers spm.kotlin.world.function.
  
**withContext** is nothing but an another way writing the async where we do not have to write await().Look at the example below  
  
suspend fun fetchUser(): User {  
    return withContext(Dispatchers.IO) {  
        // make network call  
        // return user  
    }  
}  
  
Now we will understand the scope in the below example  
Scopes in Kotlin Coroutines are very useful because we need to cancel the background task as soon as the activity is destroyed. Here, we will learn how to use scopes to handle these types of situation.  
  
Assuming that our activity is the scope, the background task should get canceled as soon as the activity is destroyed.Our activity will look like this  
  
class MainActivity : AppCompatActivity(), CoroutineScope {  
  private lateinit var job: Job  

  override val coroutineContext: CoroutineContext  
        get() = Dispatchers.Main + job  
        
   override fun onCreate(savedInstanceState: Bundle?) {  
    super.onCreate(savedInstanceState)  
    job = Job() // create the Job  
   }  

   override fun onDestroy() {  
    job.cancel() // cancel the Job  
    super.onDestroy()  
  }      
}  
  
Now, just use the launch like below:  
  
launch {  
    val userOne = async(Dispatchers.IO) { fetchFirstUser() }  
    val userTwo = async(Dispatchers.IO) { fetchSeconeUser() }  
    showUsers(userOne.await(), userTwo.await())  
}  
  
As soon as the activity is destroyed, the task will get cancelled if it is running because we have defined the scope.

When we need the global scope which is our application scope, not the activity scope, we can use the GlobalScope as below:  
  
GlobalScope.launch(Dispatchers.Main) {  
    val userOne = async(Dispatchers.IO) { fetchFirstUser() }  
    val userTwo = async(Dispatchers.IO) { fetchSeconeUser() }  
}    
  
USE OF SupervisorJob,

  
  

  


