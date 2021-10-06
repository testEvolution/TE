@Test
    public void testCloning() throws CloneNotSupportedException {
        ArcDialFrame f1 = new ArcDialFrame();
        ArcDialFrame f2 = (ArcDialFrame) f1.clone();
        assertTrue(f1 != f2);
        assertTrue(f1.getClass() == f2.getClass());
        assertTrue(f1.equals(f2));

        // check that the listener lists are independent
        MyDialLayerChangeListener l1 = new MyDialLayerChangeListener();
        f1.addChangeListener(l1);
        assertTrue(f1.hasListener(l1));
        assertFalse(f2.hasListener(l1));
    }

    