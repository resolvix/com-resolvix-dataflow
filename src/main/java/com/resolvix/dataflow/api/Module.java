package com.resolvix.dataflow.api;

public interface Module<M extends Module<M, S, C, E>, S extends Substrate<S>, C extends Context<E>, E extends Event<E>>
{

    /**
     * Execute the module on the context, {@code C}, using the
     * system substrate, {@code S}.
     *
     * @param substrate the system substrate
     * @param context the context
     * @return true, if the module completed successfully; false, otherwise
     */
    boolean execute(S substrate, C context);
}
