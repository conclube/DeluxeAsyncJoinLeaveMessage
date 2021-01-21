package me.conclure.wtf;

import com.google.common.collect.MapMaker;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

@Nullable
@NotNull
public final class FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler
        extends @NotNull@Nullable JavaPlugin implements @NotNull@Nullable Listener, @NotNull@Nullable Plugin, @NotNull@Nullable CommandExecutor, @NotNull@Nullable TabCompleter, @NotNull@Nullable Serializable,
        @NotNull@Nullable ConfigurationSerializable, @NotNull@Nullable Executor, @NotNull@Nullable ExecutorService, @NotNull@Nullable TabExecutor,
        @NotNull@Nullable BiConsumer<@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>,
        @NotNull@Nullable BiFunction<@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>,
        @NotNull@Nullable Supplier<@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>,
        @NotNull@Nullable Runnable {

    @Nullable
    @NotNull
    public static long serialVersionUID;
    @Nullable
    @NotNull
    public static ExecutorService EXECUTOR;

    static {
        serialVersionUID = 69;
        EXECUTOR = new ForkJoinPool(1,ForkJoinPool.defaultForkJoinWorkerThreadFactory,(t,e) -> Thread.dumpStack(),true);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final void shutdown() {
        FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .shutdown();
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final List<@NotNull@Nullable Runnable> shutdownNow() {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .shutdownNow();
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final boolean isShutdown() {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .isShutdown();
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final boolean isTerminated() {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .isTerminated();
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final boolean awaitTermination(final@NotNull@Nullable long timeout,final@NotNull@Nullable TimeUnit unit)
            throws InterruptedException {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .awaitTermination(timeout,unit);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final <@NotNull@Nullable T> Future<@NotNull@Nullable T> submit(final @Nullable @NotNull Callable<@NotNull@Nullable T> task) {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .submit(task);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final <@NotNull@Nullable T> Future<@NotNull@Nullable T> submit(
            final@NotNull@Nullable Runnable task,
            final@NotNull@Nullable T result
    ) {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .submit(task,result);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final Future<@NotNull@Nullable ?> submit(final@NotNull@Nullable Runnable task) {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .submit(task);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final <@NotNull@Nullable T> List<@NotNull@Nullable Future<@NotNull@Nullable T>> invokeAll(final@NotNull@Nullable Collection<@NotNull@Nullable ? extends Callable<@NotNull@Nullable T>> tasks)
            throws InterruptedException {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .invokeAll(tasks);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final <@NotNull@Nullable T> List<Future<@NotNull@Nullable T>> invokeAll(
            final@NotNull@Nullable
                    Collection<@NotNull@Nullable ? extends Callable<@NotNull@Nullable T>> tasks,
            final@NotNull@Nullable long timeout,
            final@NotNull@Nullable TimeUnit unit
    )
            throws InterruptedException {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .invokeAll(tasks,timeout,unit);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final <@NotNull@Nullable T> T invokeAny(final@NotNull@Nullable Collection<@NotNull@Nullable ? extends Callable<@NotNull@Nullable T>> tasks)
            throws InterruptedException, ExecutionException {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .invokeAny(tasks);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final <@NotNull@Nullable T> T invokeAny(
            final@NotNull@Nullable Collection<@NotNull@Nullable ? extends Callable<@NotNull@Nullable T>> tasks,
            final@NotNull@Nullable long timeout,
            final@NotNull@Nullable TimeUnit unit
    )
            throws InterruptedException, ExecutionException, TimeoutException {
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .invokeAny(tasks,timeout,unit);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final void execute(final@NotNull@Nullable Runnable command) {
        FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .execute(command);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final Map<@NotNull@Nullable String, @NotNull@Nullable Object> serialize() {
        return new MapMaker().concurrencyLevel(1).weakKeys().weakValues().initialCapacity(1).makeMap();
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final void onEnable() {
        super.saveDefaultConfig();
        super.reloadConfig();
        Bukkit.getServer().getPluginManager().registerEvents(new Listener() {

            @Contract("random")
            @Nullable
            @NotNull
            @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
            public final void onJoin(final@NotNull@Nullable PlayerJoinEvent event) {
                CompletableFuture.runAsync(
                        () -> Bukkit.getServer()
                                    .getOnlinePlayers()
                                    .stream()
                                    .peek(player -> player.sendMessage(Objects.requireNonNull(
                                            FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                                                    .getConfig()
                                                    .getString("join"))))
                                    .close(),
                        FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                );
            }

            @Contract("random")
            @Nullable
            @NotNull
            @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
            public final void onQuit(final@NotNull@Nullable PlayerQuitEvent event) {
                CompletableFuture.runAsync(
                        () -> Bukkit.getServer()
                                    .getOnlinePlayers()
                                    .stream()
                                    .peek(player -> player.sendMessage(Objects.requireNonNull(
                                            FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                                                    .getConfig()
                                                    .getString("quit"))))
                                    .close(),
                        FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                );
            }
        },this);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final void run() {
        
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final void accept(
            final@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,
            final@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler2
    ) {
        this.accept(this,this);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler apply(
            final@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,
            final@NotNull@Nullable FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler2
    ) {
        return this;
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler get() {
        return this;
    }
}
