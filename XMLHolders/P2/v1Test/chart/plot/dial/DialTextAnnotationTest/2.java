@Test
    public void testCloning() throws CloneNotSupportedException {
        // test a default instance
        DialTextAnnotation a1 = new DialTextAnnotation("A1");
        DialTextAnnotation a2 = (DialTextAnnotation) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));

        // check that the listener lists are independent
        MyDialLayerChangeListener l1 = new MyDialLayerChangeListener();
        a1.addChangeListener(l1);
        assertTrue(a1.hasListener(l1));
        assertFalse(a2.hasListener(l1));
    }


    