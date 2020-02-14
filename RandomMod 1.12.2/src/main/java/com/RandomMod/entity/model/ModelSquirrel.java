package com.RandomMod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBat - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelSquirrel extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer earRight;
    public ModelRenderer tailBottom;
    public ModelRenderer tailTop;
    public ModelRenderer earLeft;

    public ModelSquirrel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this, 17, 9);
        this.body.setRotationPoint(-2.6F, 17.0F, -1.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 12);
        this.head.setRotationPoint(-1.5F, 17.0F, -1.9F);
        this.head.addBox(-3.0F, -3.0F, -3.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(head, 0.0F, 3.141592653589793F, 0.0F);
        this.earRight = new ModelRenderer(this, 24, 0);
        this.earRight.mirror = true;
        this.earRight.setRotationPoint(0.5F, 12.8F, 0.1F);
        this.earRight.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.tailBottom = new ModelRenderer(this, 35, 13);
        this.tailBottom.setRotationPoint(-2.0F, 18.9F, 3.9F);
        this.tailBottom.addBox(0.0F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(tailBottom, -0.3012438288942213F, 0.0F, 0.0F);
        this.earLeft = new ModelRenderer(this, 19, 0);
        this.earLeft.mirror = true;
        this.earLeft.setRotationPoint(-1.0F, 1.8F, -1.0F);
        this.earLeft.addBox(1.0F, -6.0F, -2.0F, 1, 2, 1, 0.0F);
        this.tailTop = new ModelRenderer(this, 0, 0);
        this.tailTop.setRotationPoint(-2.0F, 18.2F, 4.2F);
        this.tailTop.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(tailTop, -0.20507618710933373F, 0.0F, 0.0F);
        this.head.addChild(this.earLeft);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
        this.head.render(f5);
        this.earRight.render(f5);
        this.tailBottom.render(f5);
        this.tailTop.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
}
