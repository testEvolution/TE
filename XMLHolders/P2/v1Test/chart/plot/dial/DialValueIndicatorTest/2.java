@Test
    public void testCloning() throws CloneNotSupportedException {
        // test a default instance
        DialValueIndicator i1 = new DialValueIndicator(0);
        DialValueIndicator i2 = (DialValueIndicator) i1.clone();
        assertTrue(i1 != i2);
        assertTrue(i1.getClass() == i2.getClass());
        assertTrue(i1.equals(i2));

        // check that the listener lists are independent
        MyDialLayerChangeListener l1 = new MyDialLayerChangeListener();
        i1.addChangeListener(l1);
        assertTrue(i1.hasListener(l1));
        assertFalse(i2.hasListener(l1));
    }


    