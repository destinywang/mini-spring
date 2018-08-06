package org.destiny.test.v1;

import static org.junit.Assert.*;

import org.destiny.beans.BeanDefinition;
import org.destiny.beans.factory.BeanFactory;
import org.destiny.beans.factory.support.DefaultBeanFactory;
import org.destiny.service.v1.PetStoreService;
import org.junit.Test;

/**
 * @author 王康
 * hzwangkang1@corp.netease.com
 * ------------------------------------------------------------------
 * <p></p>
 * ------------------------------------------------------------------
 * Corpright 2018 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * @version JDK 1.8.0_101
 * @since 2018/8/6 22:33
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        BeanFactory beanfactory = new DefaultBeanFactory("petstore-v1.xml");
        BeanDefinition definition = beanfactory.getBeanDefinition("petStore");
        assertEquals("PetStoreService", definition.getBeanClassName());

        PetStoreService petStoreService = (PetStoreService)beanfactory.getBean("petStore");
        assertNotNull(petStoreService);
    }
}