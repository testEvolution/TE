@Test
    public void testHashcode() {
        CompositeTitle t1 = new CompositeTitle(new BlockContainer());
        t1.getContainer().add(new TextTitle("T1"));
        CompositeTitle t2 = new CompositeTitle(new BlockContainer());
        t2.getContainer().add(new TextTitle("T1"));
        assertTrue(t1.equals(t2));
        int h1 = t1.hashCode();
        int h2 = t2.hashCode();
        assertEquals(h1, h2);
    }

    