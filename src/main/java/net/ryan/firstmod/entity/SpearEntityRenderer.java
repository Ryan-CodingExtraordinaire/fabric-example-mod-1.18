package net.ryan.firstmod.entity;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Matrix3f;
import net.minecraft.util.math.Matrix4f;
import net.minecraft.util.math.Vec3f;

public class SpearEntityRenderer extends EntityRenderer<SpearProjectileEntity> {
    protected SpearEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }


    private static final Identifier TEXTURE_LOCATION = new Identifier("resources.assets.firstmod.textures.iron_spear");
    private static final RenderLayer RENDER_TYPE = RenderLayer.getEntityCutoutNoCull(TEXTURE_LOCATION);

    private static void vertex(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, int packedLight, float x, int y, int u, int v) {
        vertexConsumer.vertex(matrix4f, x - 0.5F, (float)y - 1.0F, 0.0F).color(255, 255, 255, 255).texture((float)u, (float)v).overlay(OverlayTexture.DEFAULT_UV).light(packedLight).normal(matrix3f, 0.0F, 1.0F, 0.0F).next();
    }
    @Override
    public void render(SpearProjectileEntity projectile, float x, float partialTick, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int packedLight) {

        // here goes the rendering logic
        //
        //

        super.render(projectile, x, partialTick, matrixStack, vertexConsumerProvider, packedLight);
    }

    @Override
    public Identifier getTexture(SpearProjectileEntity entity) {
        return  TEXTURE_LOCATION;
    }


}