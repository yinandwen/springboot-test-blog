package com.mryin.blog.service.impl;

import com.mryin.blog.entity.Blog;
import com.mryin.blog.mapper.BlogMapper;
import com.mryin.blog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 测试人：MRYIN
 * @since 2021-01-30
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
