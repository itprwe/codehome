<template>
<div>
	<el-container>
		<el-header style="height: 44px;">
			<div class="header-left">
				<a class="logo">
					<img :src="logoImg"></img>
					<strong>度假订单测试平台</strong>
				</a>
				<i class="icon-paragraph-justify3"></i>			
			</div>
		</el-header>
		 <el-container>
		  	<el-aside style="width: 220px;">
		  	<div id="user">
		  		<img id="imgUserProfile" alt="image" class="profile-img" :src="user.profileImg">
		  		<span><strong>{{user.name}}</strong></span>
		  	</div>
		  	<div id="nav">
		  		<el-menu
		  		 background-color="#263238"
			      text-color="#fff"
			      active-text-color="#fff">
		          <template v-for=" menu in menus" >
		            <el-submenu :index="menu.index" v-bind:key="menu.index">
		              <template slot="title">
		                <i :class="menu.iconMsg"></i>
		                <span>{{menu.title}}</span>
		              </template>
		              <template v-for="menuChd in menu.items">
		                <el-menu-item style="padding-left: 50px" :index="menuChd.index" v-bind:key="menu.index+'_'+menuChd.index">
		                	<router-link :to="menuChd.link"><span>{{menuChd.name}}</span></router-link>
		                </el-menu-item>
		              </template>
		            </el-submenu>
		          </template>
		        </el-menu>
		  	</div>
		  </el-aside>
		  <el-container style="height:1500px;background-color:#f3f3f4;">
			  <el-main>
			    	<div id="breadcrumb">
			    		<div class="crumb_title">
			    			<h1><strong>{{$route.name}}</strong></h1>
			    		</div>
			    		<div class="crumb">
				    		<el-breadcrumb separator="/">
							  <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
							  <el-breadcrumb-item v-if="$route.name != 'Home'">{{$route.name}}</el-breadcrumb-item>
							</el-breadcrumb>
						</div>
			    	</div>
			    	<div id="contentwrap">
			    		<div id="content">
			    			<router-view></router-view>
			    		</div>
			    	</div>
			    </el-main>
			    <el-footer style="height:30px;">@CopyRight</el-footer>
		    </el-container>
		  </el-container>
	</el-container>
</div>
	
</template>

<script>
export default {
  name: 'Home',
  data () {
    return {
    	logoImg:'./static/img/logo_light.jpg',
    	user: { name:'hbhu胡海波 - 度假研发部',profileImg:'./static/img/hzw.jpg'},
      	menus:[
		          {
		            title: '导航一',
		            index: '1',
		            iconMsg:'el-icon-location',
		            items:[ 
		            		{ name: '选项一', index: '2-1', link: '/helloworld'},
		                    { name: '选项二', index:'2-2', link: '/helloworld2'}
		                  ]
		          },
		          {
		            title: '导航二',
		            index: '2',
		            iconMsg:'el-icon-menu',
		            items:[ 
		            		{ name: '选项一', index: '2-1', link: '/helloworld'},
		                    { name: '选项二', index:'2-2', link: '/helloworld2'}
		                  ]
		          }
        ]
    }
  }
}
</script>

<style type="text/css" scoped>
	
	.el-header {
		background-color: #37474f;
		color: #ffffff;
		padding: 15px 0 0 0;
		margin: 0;
	}

	.header-left {
		float: left;
		line-height: 14px;
		margin: 0px;
		padding: 0px;
	}

	.logo {
		margin-left: 20px;
	}

	.logo > img {
		height: 16px;
		width: 16px;
		margin-right: 5px;
		vertical-align: top;
	}

	.el-aside {
		background-color: #263238;
		width: 220px;
	}

	#user {
		color: #ffffff;
		background-color: #263238;
		height: 160px;
		display: flex;
		flex-direction: column;
		align-items:center;
		justify-content: center;
	}

	#user img {
		margin-bottom: 10px;
		border-radius: 50%;
		vertical-align: middle;
	}

	#nav {
		background-color:#2f4050;	
		text-align: left;
	}

	.el-menu {
		border-width: 0;
	}

	.el-menu-item > a, .router-link-active {
		text-decoration: none;
	  	color: #fff;
	}

	.el-main {
		background-color: #ffffff;
		margin: 0;
		padding: 0;
		flex-direction: row;
		color: #333;
		text-align: center;
	}

	.el-footer {
		vertical-align:bottom;
		text-align: left;
		padding-top: 5px;
		border-top: 1px solid #f3f3f4;
	}

	#breadcrumb {
		height: 100px;
		text-align: left;
		background-color: #ffffff;
	}

	.crumb, .crumb_title {
		border-bottom: 1px solid #ddd;
		margin: 5px;
		line-height: 2em;
	}

	.crumb {
		padding: 10px;
	}

	#contentwrap {
		background-color: #ffffff;

	}

	#content {
		background-color: #ffffff;
	}

	body > .el-container {
		margin: 0;
		padding: 0;

	}

</style>